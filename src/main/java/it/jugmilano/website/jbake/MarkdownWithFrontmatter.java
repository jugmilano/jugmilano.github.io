package it.jugmilano.website.jbake;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;

import org.jbake.parser.MarkdownEngine;
import org.jbake.parser.ParserContext;
import org.yaml.snakeyaml.Yaml;

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.profile.pegdown.PegdownOptionsAdapter;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.SharedDataKeys;

/**
 * This Engine process front-matter as part of JBake's DocumentModel
 */
public class MarkdownWithFrontmatter extends MarkdownEngine {

    public static final String MD_WITH_FM_KEY = "MD_WITH_FM_KEY";
    public static final String MD_WITH_FM_VALUE = "MD_WITH_FM_VALUE";
    
    @Override
    public void processHeader(ParserContext context) {
        if (context.getFileLines().get(0).equals("---")) { // might consider using opt-in flag here in the future.
            int nextIndex = getNextIndex(context);
            if (nextIndex < 1) {
                return; // early return in case does not contain front-matter
            }

            String yamlContent = context.getFileLines().subList(0, nextIndex).stream().collect(Collectors.joining("\n"));
            Yaml yaml = new Yaml();
            Map<String, Object> yamlMap = yaml.load(yamlContent);

            // set Defaults first
            context.getDocumentModel().setStatus(context.getConfig().getDefaultStatus());
            context.getDocumentModel().setType(context.getConfig().getDefaultType());

            // set parsed next
            context.getDocumentModel().putAll(yamlMap);
            if (yamlMap.get("layout") != null) {
                context.getDocumentModel().setType(yamlMap.get("layout").toString());
            }
            if (yamlMap.get("title") != null) {
                context.getDocumentModel().setTitle(yamlMap.get("title").toString());
            } else if (context.getDocumentModel().getTitle() == null) {
                context.getDocumentModel().setTitle("");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            try {
                context.getDocumentModel().setDate(sdf.parse(yamlMap.get("date").toString()));
            } catch (Exception e) {
                // do nothing
            }
            // can't set body in processHeader, so defer it.
            context.getDocumentModel().put(MD_WITH_FM_KEY, MD_WITH_FM_VALUE);
        }
    }

    /**
     * return the next line following head/get(0) that is equal to "---"
     */
    private int getNextIndex(ParserContext context) {
        ListIterator<String> it = context.getFileLines().listIterator(1);
        int nextIndex = -1;
        while (it.hasNext()) {
            int lu = it.nextIndex();
            if (it.next().equals("---")) {
                nextIndex = lu;
                break;
            }
        }
        return nextIndex;
    }

    @Override
    public void processBody(ParserContext context) {
        if (context.getDocumentModel().get(MD_WITH_FM_KEY) == MD_WITH_FM_VALUE) { // value-identity intentional.
            int nextIndex = getNextIndex(context);
            String body = context.getFileLines().subList(nextIndex+1, context.getFileLines().size()).stream().collect(Collectors.joining("\n"));
            context.getDocumentModel().setBody(body);
        }
        processBodyHardcodingHeaderIDs(context);
    }

    /**
     * like super's {@link org.jbake.parser.MarkdownEngine#processBody(ParserContext)}
     * but also enforce GENERATE_HEADER_ID, RENDER_HEADER_ID
     */
    public void processBodyHardcodingHeaderIDs(final ParserContext context) {
        List<String> mdExts = context.getConfig().getMarkdownExtensions();

        int extensions = PegdownExtensions.NONE;

        for (String ext : mdExts) {
            if (ext.startsWith("-")) {
                ext = ext.substring(1);
                extensions = removeExtension(extensions, extensionFor(ext));
            } else {
                if (ext.startsWith("+")) {
                    ext = ext.substring(1);
                }
                extensions = addExtension(extensions, extensionFor(ext));
            }
        }

        DataHolder options = PegdownOptionsAdapter.flexmarkOptions(extensions)
            .toMutable()
            .set(SharedDataKeys.GENERATE_HEADER_ID, true)
            .set(SharedDataKeys.RENDER_HEADER_ID, true)
            .toImmutable();

        Parser parser = Parser.builder(options).build();
        HtmlRenderer renderer = HtmlRenderer.builder(options).build();

        Document document = parser.parse(context.getBody());
        context.setBody(renderer.render(document));
    }

    private int extensionFor(String name) {
        int extension = PegdownExtensions.NONE;

        try {
            Field extField = PegdownExtensions.class.getDeclaredField(name);
            extension = extField.getInt(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            // do nothing
        }
        return extension;
    }

    private int addExtension(int previousExtensions, int additionalExtension) {
        return previousExtensions | additionalExtension;
    }

    private int removeExtension(int previousExtensions, int unwantedExtension) {
        return previousExtensions & (~unwantedExtension);
    }
}
