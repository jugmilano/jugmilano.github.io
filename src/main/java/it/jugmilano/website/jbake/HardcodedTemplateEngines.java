package it.jugmilano.website.jbake;

import java.util.Set;

import org.jbake.app.ContentStore;
import org.jbake.app.configuration.JBakeConfiguration;
import org.jbake.template.AbstractTemplateEngine;
import org.jbake.template.TemplateEngines;

/**
 * Since it's not possible to _override_ an existing engine using org.jbake.parser.TemplateEngines.properties,
 * also it's not possible to _programmaticaly_ register an engine with TemplateEngines as the methods are private,
 * this constructs an alternative TemplateEngines for the specifically needed engine.
 */
public class HardcodedTemplateEngines extends TemplateEngines {

    private FreemarkerConfiguredEngine fce;

    public HardcodedTemplateEngines(JBakeConfiguration config, ContentStore db) {
        super(config, db);
        this.fce = new FreemarkerConfiguredEngine(config, db);
    }

    @Override
    public AbstractTemplateEngine getEngine(String fileExtension) {
        return fileExtension.equals("ftl") ? fce : null;
    }

    @Override
    public Set<String> getRecognizedExtensions() {
        return Set.of("ftl");
    }
    
}
