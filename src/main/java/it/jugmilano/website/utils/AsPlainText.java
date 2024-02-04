package it.jugmilano.website.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;

public class AsPlainText {
    
    /**
     * Parse an HTML fragment and returns a meaningful text representation,
     * where A html tags are replaced with a MarkDown-equivalent,
     * and preserving newlines.
     */
    public static String asPlainText(String html) {
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(false);
        Document doc = Jsoup.parseBodyFragment(html);
        doc.outputSettings(outputSettings);
        doc.select("a").forEach(a-> a.replaceWith(new TextNode("[" + a.text() + "](" + a.attr("href") + ")")));
        return Jsoup.clean(doc.html(), "", Safelist.none(), outputSettings);
    }
}
