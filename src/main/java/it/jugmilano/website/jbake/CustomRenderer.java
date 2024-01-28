package it.jugmilano.website.jbake;

import org.jbake.app.ContentStore;
import org.jbake.app.Renderer;
import org.jbake.app.configuration.JBakeConfiguration;

/**
 * CustomRenderer overriding Renderer default constructor using specifically CustomDelegatingTemplateEngine
 */
public class CustomRenderer extends Renderer {

    public CustomRenderer(ContentStore db, JBakeConfiguration config) {
        super(db, config, new CustomDelegatingTemplateEngine(db, config));
    }
    
}
