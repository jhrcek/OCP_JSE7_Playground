package ocpjse7.processed;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest2 implements Runnable {

    private AtomicInteger ai;

    public AtomicIntegerTest2(AtomicInteger ai) {
        this.ai = ai;
    }

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(0);
        for (int i = 0; i < 50; i++) { //Will print some random ordering of 1 - 50, because ACCESS TO CONSOLE NOT SYNCHRONIZED!
            Runnable r = new AtomicIntegerTest2(ai);
            Thread t = new Thread(r);
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println(ai.incrementAndGet());
    }
}
