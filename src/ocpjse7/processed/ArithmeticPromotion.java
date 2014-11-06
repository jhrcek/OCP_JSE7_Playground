package ocpjse7.processed;

public class ArithmeticPromotion {

    public static void main(String[] args) {
        byte b = 1;
        byte c = (byte) (b * b); //cast MANDATORY (otherwise compile error)
        // because when both operands are of type less than int (byte, short, char) they are both promoted to int
    }
}
