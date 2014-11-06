package ocpjse7;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author jhrcek
 */
public class TheadPoolExec {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exec = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            Future<?> future
                    = exec.submit(new Runnable() {

                        @Override
                        public void run() {
                            try {
                                Thread.sleep(500 + new Random().nextInt(1000));
                            } catch (InterruptedException ex) {
                            }
                            System.out.println("Task finished ...");
                        }
                    });
            Object get = future.get();
            System.out.println(get);

        }
    }
}
