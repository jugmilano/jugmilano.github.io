package it.jugmilano.website;

import java.io.File;
import java.nio.file.Paths;

import org.jbake.app.Oven;
import org.jbake.app.configuration.DefaultJBakeConfiguration;
import org.jbake.app.configuration.JBakeConfigurationFactory;
import org.jbake.parser.Engines;

import it.jugmilano.website.jbake.CustomRenderer;
import it.jugmilano.website.jbake.MarkdownWithFrontmatter;

/**
 * Can't use JBake-maven-plugin due to need of programmatically configure:
 * - Markdown with front-matter
 * - Additional custom config in Freemarker config
 */
public class BakeRunner {
    public static void main(String[] args) {
        JBakeConfigurationFactory factory = new JBakeConfigurationFactory();
        DefaultJBakeConfiguration config = factory.createDefaultJbakeConfiguration(Paths.get("./").toFile(), new File("target/website"), true);

        Oven oven = new Oven(config);
        Engines.register("md", new MarkdownWithFrontmatter());

        oven.getUtensils().setRenderer(new CustomRenderer(oven.getUtensils().getContentStore(), config));

        oven.bake(); 
    }
}
