package ocpjse7.processed;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermissions;

public class NioPathDemo {

    public static void main(String[] args) throws IOException {
        absolutePaths();
        relativePath();
        relativize();
    }

    private static void relativePath() {
        Path p = Paths.get("some");
        System.out.println("absolute:" + p.toAbsolutePath()); //prepends current working dir
        System.out.println("getParent(): " + p.getParent()); //returns null
        System.out.println("getRoot(): " + p.getRoot()); //returns null
    }

    public static void absolutePaths() throws IOException {
        Path home = Paths.get("/home/jhrcek");
        System.out.println(home + " is absolute: " + home.isAbsolute());

        Path temp = Paths.get("/home/jhrcek/Temp");
        Path current = Paths.get("").toAbsolutePath();
        System.out.println("current: " + current);
        System.out.println("0th name in current path: " + current.getName(0));
        System.out.println("current endswith Dummy: " + current.endsWith("Dummy"));
        System.out.println("path from current to Temp: " + current.relativize(temp));
        System.out.println("Supported attribute views: " + temp.getFileSystem().supportedFileAttributeViews());

        Path dopis = temp.resolve("pruvodni-dopis.txt");
        System.out.println("dopis: " + dopis);

        BasicFileAttributes attrs
                = Files.readAttributes(dopis, BasicFileAttributes.class);

        System.out.println("basic attribute - last access time: " + attrs.lastAccessTime());
        PosixFileAttributes attrs2 = Files.getFileAttributeView(dopis, PosixFileAttributeView.class)
                .readAttributes();
        System.out.format("Owner and permissions: %s %s%n",
                attrs2.owner().getName(),
                PosixFilePermissions.toString(attrs2.permissions()));

        System.out.println("Radky dopisu: ");
        for (String line : Files.readAllLines(dopis, StandardCharsets.UTF_8)) {
            System.out.println(line);
        }
    }

    public static void relativize() {
        Path a = Paths.get("/jhrcek");
        Path b = Paths.get("/jhrcek/file");
        System.out.println(a.relativize(b));
        System.out.println(b.relativize(a));
    }
}
