package it.jugmilano.website.jbake;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jbake.app.ContentStore;
import org.jbake.app.configuration.JBakeConfiguration;
import org.jbake.template.FreemarkerTemplateEngine;
import org.jbake.template.RenderingException;
import org.jbake.template.model.TemplateModel;

import freemarker.core.TemplateDateFormatFactory;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;
import it.jugmilano.website.utils.AsPlainText;

/**
 * Customized FreemarkerTemplateEngine to override FreeMarker configuration with additional settings.
 */
public class FreemarkerConfiguredEngine extends FreemarkerTemplateEngine {
    private Configuration templateCfg;
    
    public FreemarkerConfiguredEngine(final JBakeConfiguration config, final ContentStore db) {
        super(config, db);
        createTemplateConfiguration();
    }

    private void createTemplateConfiguration() {
        templateCfg = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        templateCfg.setDefaultEncoding(config.getRenderEncoding());
        templateCfg.setOutputEncoding(config.getOutputEncoding());
        if (config.getFreemarkerTimeZone() != null) {
            templateCfg.setTimeZone(config.getFreemarkerTimeZone());
            templateCfg.setSQLDateAndTimeTimeZone(config.getFreemarkerTimeZone());
        }
        try {
            templateCfg.setDirectoryForTemplateLoading(config.getTemplateFolder());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // additional config needed for jugmilano into Freemarker config
        Map<String, TemplateDateFormatFactory> customDateFormats = new HashMap<>();
        customDateFormats.put("jugmilanomeetingdate", JUGMilanoMeetingdateDateFormatFactory.INSTANCE);
        templateCfg.setCustomDateFormats(customDateFormats);

        templateCfg.setSharedVariable("asPlainText", new TemplateMethodModel() {
            @Override
            public Object exec(List arguments) throws TemplateModelException {
                return AsPlainText.asPlainText((String) arguments.get(0)); // TemplateMethodModel args are String coerced by FTL
            }
        });
    }

    @Override
    public void renderDocument(final TemplateModel model, final String templateName, final Writer writer) throws RenderingException {
        try {
            Template template = templateCfg.getTemplate(templateName);
            template.process(new FreemarkerTemplateEngine.LazyLoadingModel(templateCfg.getObjectWrapper(), model, db, config), writer);
        } catch (IOException | TemplateException e) {
            throw new RenderingException(e);
        }
    }
}
