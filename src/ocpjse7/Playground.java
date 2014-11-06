package ocpjse7;

import java.util.Arrays;

public class Playground {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(MyEn.values()));
    }

    private static enum MyEn {

        UNDEFINED(""),
        BHOJ("Yes"),
        SHIT("No");

        @Override
        public String toString() {
            return name;
        }

        private final String name;

        private MyEn(String n) {
            name = n;
        }
    }
}
