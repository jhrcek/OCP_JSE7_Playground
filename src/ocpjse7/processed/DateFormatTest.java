package ocpjse7.processed;

import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    public static void main(String[] args) {
        Date now = new Date();
        String fs = "%-20s %23s%n";
        PrintStream o = System.out;

        o.println("Default: ");
        o.printf(fs, "getInstance ", DateFormat.getInstance().format(now));
        o.printf(fs, "Date ", DateFormat.getDateInstance().format(now));
        o.printf(fs, "Time ", DateFormat.getTimeInstance().format(now));
        o.printf(fs, "DateTime ", DateFormat.getDateTimeInstance().format(now));

        int[] formats = {DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG, DateFormat.FULL};
        String[] formatNames = {"SHORT", "MEDIUM", "LONG", "FULL"};

        for (int i = 0; i < formats.length; i++) {
            o.println("----------\n" + formatNames[i]);
            o.printf(fs, "Date", DateFormat.getDateInstance(formats[i]).format(now));
            o.printf(fs, "Time", DateFormat.getTimeInstance(formats[i]).format(now));
            o.printf(fs, "DateTime",
                    DateFormat.getDateTimeInstance(formats[i], formats[i]).format(now));
        }

        Locale csLoc = new Locale("cs");
        for (int i = 0; i < formats.length; i++) {
            o.println("----------\n" + formatNames[i] + " + cs locale");
            o.printf(fs, "Date", DateFormat.getDateInstance(formats[i], csLoc).format(now));
            o.printf(fs, "Time", DateFormat.getTimeInstance(formats[i], csLoc).format(now));
            o.printf(fs, "DateTime", DateFormat.getDateTimeInstance(formats[i], formats[i], csLoc).format(now));
        }
    }
}
