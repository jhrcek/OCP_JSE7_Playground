package ocpjse7.processed;

public class WaitOnNonLockedObject {

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        o.wait(); //Compiles OK, but will throw IllegalMonitorStateException at runtime
        //-> you need to hold lock on o to be able to call wait on it
    }

}
