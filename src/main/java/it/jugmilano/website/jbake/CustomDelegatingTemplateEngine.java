package it.jugmilano.website.jbake;

import java.io.File;
import java.io.Writer;

import org.jbake.app.ContentStore;
import org.jbake.app.configuration.JBakeConfiguration;
import org.jbake.template.AbstractTemplateEngine;
import org.jbake.template.DelegatingTemplateEngine;
import org.jbake.template.RenderingException;
import org.jbake.template.model.TemplateModel;

import org.jbake.app.FileUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Custom delagating template engine using HardcodedTemplateEngines 
 */
public class CustomDelegatingTemplateEngine extends DelegatingTemplateEngine {
    private static final Logger LOGGER = LoggerFactory.getLogger(DelegatingTemplateEngine.class);
    private HardcodedTemplateEngines renderers;

    public CustomDelegatingTemplateEngine(ContentStore db, JBakeConfiguration config) {
        super(db, config);
        renderers = new HardcodedTemplateEngines(config, db);
    }

    @Override
    public void renderDocument(final TemplateModel model, final String templateName, final Writer writer) throws RenderingException {
        model.setVersion(config.getVersion());
        model.setConfig(config.asHashMap());

        // if default template exists we will use it
        File templateFolder = config.getTemplateFolder();
        File templateFile = new File(templateFolder, templateName);
        String theTemplateName = templateName;
        if (!templateFile.exists()) {
            LOGGER.info("Default template: {} was not found, searching for others...", templateName);
            // if default template does not exist then check if any alternative engine templates exist
            String templateNameWithoutExt = templateName.substring(0, templateName.length() - 4);
            for (String extension : renderers.getRecognizedExtensions()) {
                templateFile = new File(templateFolder, templateNameWithoutExt + "." + extension);
                if (templateFile.exists()) {
                    LOGGER.info("Found alternative template file: {} using this instead", templateFile.getName());
                    theTemplateName = templateFile.getName();
                    break;
                }
            }
        }
        String ext = FileUtil.fileExt(theTemplateName);
        AbstractTemplateEngine engine = renderers.getEngine(ext);
        if (engine != null) {
            engine.renderDocument(model, theTemplateName, writer);
        } else {
            LOGGER.error("Warning - No template engine found for template: {}", theTemplateName);
        }
    }
    
}
