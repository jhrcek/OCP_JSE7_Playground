package ocpjse7.processed;

import java.util.ArrayList;
import java.util.List;

public class RawGenericsInteroperability {

    public static void main(String[] args) {
        // Compiles with warning
        List raw2raw = new ArrayList();
        List<String> raw2gen = new ArrayList();
        List gen2raw = new ArrayList<String>();

        // Compiles OK
        List<String> gen2gen = new ArrayList<String>();
    }
}
