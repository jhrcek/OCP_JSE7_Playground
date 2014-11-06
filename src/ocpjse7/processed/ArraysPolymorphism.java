package ocpjse7.processed;

/**
 * Subtyping for arrays works as for normal types (Unlike for Generic classes, which are implemented by type erasure).
 */
public class ArraysPolymorphism {

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException[] a = new ArrayIndexOutOfBoundsException[2];
        IndexOutOfBoundsException[] i = new IndexOutOfBoundsException[2];
        //i = a; // OK

        System.out.println(a instanceof ArrayIndexOutOfBoundsException[]);
        System.out.println(a instanceof IndexOutOfBoundsException[]);
        System.out.println(i instanceof ArrayIndexOutOfBoundsException[]); // false
        System.out.println(i instanceof IndexOutOfBoundsException[]);
    }
}
