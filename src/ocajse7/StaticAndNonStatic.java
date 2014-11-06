package ocajse7;

/**
 *
 * @author jhrcek
 */
public class StaticAndNonStatic {

    public static void main(String[] args) {
        new StaticAndNonStatic().a();
    }

    public static void a() {
        System.out.println("static");
    }

    //You cannot have static and instance method with the same name
//    public void a() {
//        System.out.println("instance");
//    }
}
