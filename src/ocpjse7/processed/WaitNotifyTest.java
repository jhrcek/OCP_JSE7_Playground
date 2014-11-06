package ocpjse7.processed;



public class WaitNotifyTest {

    protected static final Object o = new Object();

    public static void main(String[] args) throws InterruptedException {

        Savior savior = new Savior();
        savior.o = o;
        savior.start();
        System.out.println("waiting for savior...");
        synchronized (o) {
            o.wait();
        }
        System.out.println("He saved me!");
    }
}

class Savior extends Thread {

    Object o;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }

        synchronized (o) {
            o.notify();
        }
    }
}
