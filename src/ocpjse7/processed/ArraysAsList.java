package ocpjse7.processed;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

    public static void main(String[] args) {
        String[] sa = {"a", "b", "c"};
        // Arrays as list return just simple wrapper (private static List impl in Arrays class)
        List<String> sl = Arrays.asList(sa);
        printBoth(sa, sl);

        sa[0] = "1"; // Changing array elem changes the wrapping list as well
        printBoth(sa, sl);

        sl.set(1, "2"); // Chanking the wrapping list changes the underlying array as well
        printBoth(sa, sl);

        //sl.add("d"); // Will throw UnsupportedOperationException, because the array is not resizable
    }

    public static void printBoth(String[] sa, List<String> sl) {
        System.out.println(Arrays.toString(sa));
        System.out.println(sl);
    }
}
