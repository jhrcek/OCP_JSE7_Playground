package ocpjse7.processed;

import java.io.IOException;

public class ExceptionRethrowType {

    public static void main(String[] args) throws IOException { //1
        try {
            throw new IOException();
        } catch (Exception e) { // Catching IOE using broader Exception type
            throw e; // The type of rethrown is the ACTUAL TYPE of exception (IOE), therefore throws at 1 is enough
            //If we threw Exception in the try, 1 would need to be also upgraded to Exception
        }
    }
}
