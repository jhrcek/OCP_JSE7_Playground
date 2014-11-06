package ocpjse7.resources;

import java.net.URISyntaxException;

public class ResourceTest {

    public static void main(String[] args) throws URISyntaxException {
        System.out.println(ResourceTest.class.getResource("resource.txt").toExternalForm());
        System.out.println(ResourceTest.class.getResource("resource.txt").toURI());
        System.out.println(ResourceTest.class.getResource("resource.txt").toString());
        System.out.println(ResourceTest.class.getProtectionDomain().getCodeSource().getLocation().getPath());
    }
}
