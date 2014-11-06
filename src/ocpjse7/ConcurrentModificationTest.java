package ocpjse7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentModificationTest {

    public static void main(String[] args) {
        //1) Concurrent modification exception
        Set<String> s = new TreeSet<>();
        s.add("b");
        s.add("a");
        Iterator<String> it = s.iterator();
        s.add("d");
        while (it.hasNext()) {
            System.out.println(it.next()); //Will throw ConcurrentModificationException because we added "d" AFTER we created iterator
        }
        
        //2) No exception
        Set<String> s2 = new CopyOnWriteArraySet<>();
        s2.add("b");
        s2.add("a");
        Iterator<String> it2 = s2.iterator();
        s2.add("d");
        while (it2.hasNext()) {
            System.out.println(it2.next()); // NO EXCEPTION and iterator will show elements from the time BEFORE MODIFICATION (only a and b)
        }
    }
}
