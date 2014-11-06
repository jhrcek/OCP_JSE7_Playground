package ocpjse7.processed;

public class TernaryOperatorBoolean {

    public static void main(String[] args) {
        //1) won't compile
        //System.out.println(null ? "a" : "b"); //won't compile

        //2) Compiles OK but throws NPE
        Boolean b = null;
        System.out.println(b ? "a" : "b");

        //3) Compiles OK and works thanks to autounboxing
        Boolean c = Boolean.TRUE;
        System.out.println(c ? "a" : "b");
    }
}
