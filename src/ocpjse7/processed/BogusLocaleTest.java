package ocpjse7.processed;

import java.util.Locale;

public class BogusLocaleTest {

    public static void main(String[] args) {
        Locale loc = new Locale("navi", "ghark", "th"); //Bogus locales work - no excpetion thrown
        System.out.println(loc); //Prints: navi_GHARK_th
    }
}
