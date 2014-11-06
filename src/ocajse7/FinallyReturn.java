package ocajse7;

/**
 *
 * @author jhrcek
 */
public class FinallyReturn {

    public static void main(String[] args) {
        System.out.println(meth());
    }

    public static int meth() {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println(e + "caught");
            throw new NullPointerException();
        } finally {
            return 1;
        }
    }
}
