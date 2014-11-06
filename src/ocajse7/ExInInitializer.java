package ocajse7;

/**
 *
 * @author jhrcek
 */
public class ExInInitializer {

    static int i;
    static int k = 0;

    static {
        i = 10 / k;
    }

    {
        i = 10 / k;
        i = Integer.parseInt("15.2");
    }

    public static void main(String[] args) {
        new ExInInitializer();
    }
}
