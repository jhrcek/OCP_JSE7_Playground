package ocpjse7.processed;

import java.io.ByteArrayInputStream;

public class InputStreamMarkTest {

    public static void main(String[] args) {
        byte[] buf = {(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6};
        ByteArrayInputStream is = new ByteArrayInputStream(buf);
        is.mark(2); //Mark the current position (i.e. 0)

        System.out.println(is.read());
        System.out.println(is.read());
        System.out.println(is.read());
        is.reset(); // reset stream to marked position, will read from 0 again
        System.out.println(is.read());
    }
}
