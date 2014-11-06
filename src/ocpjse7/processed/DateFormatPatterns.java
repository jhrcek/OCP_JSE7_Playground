package ocpjse7.processed;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatPatterns {

    public static void main(String[] args) {

        String[] patterns = {
            "E",
            "EE",
            "EEE", //1-3 symbols - shortened form (Fri)
            "EEEE", // 4+ symbols - full form (Friday)

            "M",
            "MM",
            "MMM",
            "MMMM",
            "yyyy.MM.dd G 'at' HH:mm:ss z",
            "EEE, MMM d, ''yy",
            "hh 'o''clock' a, zzzz",
            "K:mm a, z"
        };

        for (String pattern : patterns) {
            printToday(pattern);
        }

    }

    public static void printToday(String format) {
        System.out.println(new SimpleDateFormat(format).format(new Date()));
    }
}
