package it.jugmilano.website.jbake;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.stream.Collectors;

import freemarker.core.Environment;
import freemarker.core.InvalidFormatParametersException;
import freemarker.core.TemplateDateFormat;
import freemarker.core.TemplateDateFormatFactory;
import freemarker.core.TemplateFormatUtil;
import freemarker.core.UnformattableValueException;
import freemarker.core.UnparsableValueException;
import freemarker.template.TemplateDateModel;
import freemarker.template.TemplateModelException;

public class JUGMilanoMeetingdateDateFormatFactory extends TemplateDateFormatFactory {

    public static final JUGMilanoMeetingdateDateFormatFactory INSTANCE = new JUGMilanoMeetingdateDateFormatFactory();

    private JUGMilanoMeetingdateDateFormatFactory() {
        // to be used be singleton INSTANCE.
    }

    @Override
    public TemplateDateFormat get(String params, int dateType,
            Locale locale, TimeZone timeZone, boolean zonelessInput,
            Environment env)
            throws InvalidFormatParametersException {
        TemplateFormatUtil.checkHasNoParameters(params);
        return JUGMilanoMeetingdateDateFormat.INSTANCE;
    }

    private static class JUGMilanoMeetingdateDateFormat extends TemplateDateFormat {

        private static final JUGMilanoMeetingdateDateFormat INSTANCE = new JUGMilanoMeetingdateDateFormat();
        private final Locale it_IT;
        private final SimpleDateFormat sdf;
        private JUGMilanoMeetingdateDateFormat() {
            it_IT = Locale.of("it", "IT");
            // Giovedì 9 Novembre 2023
            sdf = new SimpleDateFormat("EEEE dd MMMM YYYY", it_IT);
        }

        @Override
        public String formatToPlainText(TemplateDateModel dateModel) throws UnformattableValueException, TemplateModelException {
            return capitalizeWords(sdf.format(TemplateFormatUtil.getNonNullDate(dateModel)));
        }

        public static String capitalizeWords(String text) {
            if (text == null || text.isEmpty()) {
                return text;
            }
            return Arrays.stream(text.split("\\s+"))
                    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                    .collect(Collectors.joining(" "));
        }


        @Override
        public boolean isLocaleBound() {
            return false;
        }

        @Override
        public boolean isTimeZoneBound() {
            return false;
        }

        @Override
        public Date parse(String s, int dateType) throws UnparsableValueException {
            try {
                return sdf.parse(s);
            } catch (Exception e) {
                throw new UnparsableValueException("Malformed string");
            }
        }

        @Override
        public String getDescription() {
            return "jugmilano meetingdate";
        }

    }

}
