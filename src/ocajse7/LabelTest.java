package ocajse7;

/**
 *
 * @author jhrcek
 */
public class LabelTest {

    public static void main(String[] args) {
        my:
        {
            int i = 1;
            if (i < 5) {
                System.out.println("1");
                break my;
            } else {
                System.out.println("2");
            }
            System.out.println("3");
        }
        System.out.println("4");
        
        
        System.out.println(new java.util.Date(113, 11, 24));
        
       
    }
}
