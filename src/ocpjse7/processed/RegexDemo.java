package ocpjse7.processed;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        ipAddressRegex();
        stringSplit();
    }

    static void ipAddressRegex() {
        String digitGroup = "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)";
        String ipPattern = String.format("(%s\\.){3}%<s", digitGroup);
        Pattern pattern = Pattern.compile(ipPattern);
        System.out.println("Pattern: " + pattern);
        Matcher matcher = pattern.matcher("123.23.21.4");
        System.out.println("matcher.matches() = " + matcher.matches());
        matcher.reset(); // If we don't reset, "java.lang.IllegalStateException: No match found" is thrown, 
        // because matches gets it to state whem match is already found AND there are no more matches
        matcher.find();
        for (int i = 0; i <= matcher.groupCount(); i++) {
            System.out.printf("group %d : %s%n", i, matcher.group(i));
        }
    }

    static void stringSplit() {
        System.out.println(Arrays.toString("aba*abaa**aabaa***".split("a\\*", 10)));
        System.out.println(Arrays.toString("aba*abaa**aabaa***".split("a\\**", 10)));
        System.out.println(Arrays.toString("ababababababababababa".split("b", 5)));
        System.out.println(Arrays.toString("1a2@3#4 5\t6\n7A8".split("\\D")));// \D zahrnuje VSE krom [0-9]
        System.out.println(Arrays.toString("a:b:a".split(":|b", 0)));// Or se vyjadri pomoci |
    }
}
