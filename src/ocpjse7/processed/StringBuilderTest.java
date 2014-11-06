package ocpjse7.processed;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        // replace takes the area (1st idx inclusive, 2nd exclusive) and inserts there the string specified by 3rd arg (no matter its length!)
        System.out.println(sb.replace(2, 3, "BLA")); // -> stBLArt
    }
}
