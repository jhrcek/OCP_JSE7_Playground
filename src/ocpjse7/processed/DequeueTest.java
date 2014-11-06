package ocpjse7.processed;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueTest {

    public static void main(String[] args) {
        Deque<String> d = new ArrayDeque<>();
        d.addFirst("1");
        d.addFirst("2");
        d.addFirst("3");
        System.out.println(d.pollLast()); // 1
        System.out.println(d.pollLast()); // 2
        System.out.println(d.pollLast()); // 3
        System.out.println(d); // []
    }
}
