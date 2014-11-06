package ocpjse7.processed;

public class CastTest {

    // The type of E is determined based on context in which the method cast is called
    public static <E> E cast(Object o) {
        return (E) o;
    }

    public static void main(String[] args) {
        Object o1 = 1;
        Object o2 = "muj";

        Integer i = cast(o1); //OK, will bind E to Integer
        String s = cast(o2); //OK, will beind E to String

        System.out.println(i);
        System.out.println(s);
    }
}
