package ocpjse7.processed;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("ocpjse7.processed.Muj", new Locale("cs"));
        System.out.println(rb.getString("bye"));
    }
}
