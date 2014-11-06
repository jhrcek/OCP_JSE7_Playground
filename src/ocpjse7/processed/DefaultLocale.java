package ocpjse7.processed;

import java.util.Locale;

public class DefaultLocale {

    public static void main(String[] args) {
        System.out.println("Original defaults:");
        printDefaultLocales();

        System.out.println("Setting default for DISPLAY: " + Locale.GERMANY);
        Locale.setDefault(Locale.Category.DISPLAY, Locale.GERMANY); //sets just DISPLAY, (plain default & FORMAT not touched)
        printDefaultLocales();

        System.out.println("Setting default for FORMAT: " + Locale.JAPAN);
        Locale.setDefault(Locale.Category.FORMAT, Locale.JAPAN);    //sets just FORMAT, (plain default & DISPLAY not touched)
        printDefaultLocales();

        System.out.println("Setting default: " + Locale.CHINA);
        Locale.setDefault(Locale.CHINA);                            //sets ALL 3 defaults
        printDefaultLocales();
    }

    private static void printDefaultLocales() {
        System.out.println("Display: " + Locale.getDefault(Locale.Category.DISPLAY));
        System.out.println("Format:  " + Locale.getDefault(Locale.Category.FORMAT));
        System.out.println("Default: " + Locale.getDefault());
    }
}
