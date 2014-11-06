package ocpjse7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsDemo {

    public static void main(String[] args) {
        //addAllTest();
        iteratorRemoveTest();
    }

    private static void iteratorRemoveTest() {
        List<Integer> li = new ArrayList<>();

        li.addAll(Arrays.asList(new Integer[]{1, 2, 3}));
        ListIterator<Integer> it = li.listIterator();
        it.next();
        it.remove();
        //it.remove(); // Calling remove() twice without next() will cause IllegalStateException
    }

    private static void addAllTest() {
        List<Integer> li = new LinkedList<>();

        li.add(1);
        li.addAll(1, Arrays.asList(new Integer[]{2, 3, 4}));
        li.add(5);

        System.out.println(li);
        ListIterator<Integer> liter = li.listIterator();
        while (liter.hasNext()) {
            System.out.printf("idx = %d, e = %s%n", liter.nextIndex(), liter.next());
            liter.nextIndex();
        }
    }
}
