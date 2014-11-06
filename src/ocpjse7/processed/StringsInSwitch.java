package ocpjse7.processed;

public class StringsInSwitch {

    public static void main(String[] args) {

        //String s = null; // Will cause NPE in line with switch()
        String s = "abc"; // Matched as if by String's equals(), i.e. case sensitive

        switch (s) {
            case "abc":
                System.out.println("abc");
                break;
            case "123":
                System.out.println("123");
                break;
            default:
                System.out.println("default");
        }
    }
}
