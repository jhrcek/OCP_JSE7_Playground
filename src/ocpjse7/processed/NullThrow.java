package ocpjse7.processed;

public class NullThrow {

    public static void main(String[] args) {
        try {
            throw null; // It compiles OK when null is thrown, but it results in NPE at runtime
        } catch (NullPointerException e) {
            System.out.println("NPE 1 thrown");
        }

        try {
            RuntimeException re = null;
            throw re;
        } catch (NullPointerException e) {
            System.out.println("NPE 2 thrown");
        }
    }
}
