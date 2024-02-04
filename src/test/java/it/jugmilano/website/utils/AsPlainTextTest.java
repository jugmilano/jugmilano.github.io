package it.jugmilano.website.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AsPlainTextTest {

    @Test
    public void test101() {
        String html = "<div><p><a href=\"#\">Lorem</a> ipsum.</p>";
        assertThat(AsPlainText.asPlainText(html)).isEqualTo("[Lorem](#) ipsum.");
    }

    @Test
    public void test102() {
        String html = "<div><p><a href=\"#\">Lorem</a>\n ipsum.</p>";
        assertThat(AsPlainText.asPlainText(html)).isEqualTo("[Lorem](#)\n ipsum.");
    }
}
