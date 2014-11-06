package ocpjse7.processed;

public class AutoCloseableTest {

    public static void main(String[] args) throws MyEx {
        try {
            try (MyAuto a = new MyAuto("a"); // Resources closed in REVERSED order of their declaration
                    MyAuto b = new MyAuto("b")) {
                throw new MyEx("from try");
            } finally {
                System.out.println("in explicit finally"); //Explicit finally called AFTER implicit finally
            }
        } catch (MyEx e) {
            System.out.println(e); //If exception(s) thrown both from try AND from close methods, the ones from close() set as SUPPRESSED exceptions of the one from try
            for (Throwable t : e.getSuppressed()) {
                System.out.println(" supressed Exception: " + t);
            }
        }
    }
}

class MyAuto implements AutoCloseable {

    private final String name;

    MyAuto(String name) {
        this.name = name;
    }

    @Override
    public void close() throws MyEx {
        System.out.println(name + ":close()");
        throw new MyEx("from close");
    }
}

class MyEx extends Exception {

    MyEx(String s) {
        super(s);
    }
}
