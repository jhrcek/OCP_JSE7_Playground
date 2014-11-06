package ocpjse7.processed;

import java.util.Arrays;

public class StringCompareTo {

    public static void main(String[] args) {
        System.out.println("a".compareTo("A")); //32
        System.out.println("1".compareTo("2")); //-1
        System.out.println("A".compareTo("a")); //-32

        String[] a = new String[]{"a", "1", "A"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); // ->  [1, A, a]
    }
}
