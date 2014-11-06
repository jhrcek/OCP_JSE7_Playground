package ocpjse7.processed;

public class EnvAndSystemProperties {

    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getenv("JAVA_HOME")); // /usr/java/default
        System.out.println(System.getProperty("java.home")); // /usr/lib/jvm/java-1.7.0-openjdk-1.7.0.60.x86_64/jre
    }
}
