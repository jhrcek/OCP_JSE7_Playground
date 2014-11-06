package ocpjse7.processed;

import java.util.List;

public class TypeInference {

    public static void main(String[] args) {
        //method(new ArrayList<>()); // Compile error - type inference unable to determine type
    }

    public static void method(List<String> list) {
    }
}
