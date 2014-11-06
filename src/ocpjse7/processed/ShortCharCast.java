package ocpjse7.processed;

public class ShortCharCast {

    public static void main(String[] args) {
        short s = 15;
        char a = '5';

        //When casting char to short and vice versa, cast is always MANDATORY (both can represent values that the other cannot -> possible precision loss
        s = (short) a;
        char c = (char) s;
    }
}
