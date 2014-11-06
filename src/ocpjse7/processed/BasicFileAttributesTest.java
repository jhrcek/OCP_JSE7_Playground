package ocpjse7.processed;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermissions;

public class BasicFileAttributesTest {

    public static void main(String[] args) {
        Path p = Paths.get("/home/jhrcek/Temp");
        Path f = p.resolve("pruvodni-dopis.txt");

        try {
            PrintStream o = System.out;
            BasicFileAttributes bfa = Files.readAttributes(f, BasicFileAttributes.class); // Can throw IOException
            o.println("idDirectory: " + bfa.isDirectory());
            o.println("size: " + bfa.size());
            o.println("isRegularFile: " + bfa.isRegularFile());
            o.println("creationTime: " + bfa.creationTime());
            o.println("lastAccessTime: " + bfa.lastAccessTime());
            o.println("lastModifiedTime: " + bfa.lastModifiedTime());

            DosFileAttributes dfa = Files.readAttributes(f, DosFileAttributes.class); // Can throw IOException
            o.println("isHidden: " + dfa.isHidden());
            o.println("isReadOnly: " + dfa.isReadOnly());
            o.println("isSystem: " + dfa.isSystem());
            o.println("isArchive: " + dfa.isArchive());

            PosixFileAttributes pfa = Files.readAttributes(f, PosixFileAttributes.class); // Can throw IOException
            o.println("owner: " + pfa.owner());
            o.println("group: " + pfa.group());
            o.println("permissions: " + PosixFilePermissions.toString(pfa.permissions()));

            //Alternatively can be obtained from some FileAttributeView subclass
            PosixFileAttributeView v = Files.getFileAttributeView(p, PosixFileAttributeView.class);
            System.out.println(v.name());
            System.out.println(v.readAttributes().permissions());
        } catch (IOException ex) {
            System.out.println("Ex: " + ex);
        }
    }
}
