package ocpjse7;

import java.util.Date;

public class PrintfTest {

    public static void main(String[] args) {
        System.out.printf("%d %<d %d %<d", 1, 2);
        System.out.printf("%td %<tB %<tY", new Date());
    }
}
