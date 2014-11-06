package ocpjse7.processed;

public class StringReplace {

    public static void main(String[] args) {
        String test = "Talk a little, walk a little, falt a little!";
        //All three replace ALL OCCURENCES! T he first 2 replace literal matches (no regexes!), the 3rd takes REGEX as first param
        System.out.println(test.replace('a', '_'));
        System.out.println(test.replace("a little", "a lot"));
        System.out.println(test.replaceAll("a\\s\\w*", "a lot"));
    }
}
