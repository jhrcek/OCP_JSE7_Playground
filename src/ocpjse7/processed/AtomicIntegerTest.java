package ocpjse7.processed;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

    private static final AtomicInteger counter = new AtomicInteger(0);

    static class Decrementer extends Thread {

        @Override
        public void run() {
            counter.decrementAndGet();
        }
    }

    static class Incrementer extends Thread {

        @Override
        public void run() {
            counter.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 5; j++) {
            new Incrementer().start();
            new Decrementer().start();
        }
        System.out.println(counter); // In theory can print anything between -5 to 5 (in practice 90% is 0, sometimes -1/1)
        // because there's curr thread & the In/Decrementers don't synchronize access to counter
    }
}
