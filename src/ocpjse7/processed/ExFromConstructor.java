package ocpjse7.processed;

import java.io.IOException;

/**
 * When checked exception is thrown from class' constructor, its subclasses must also declare this exception or any of
 * its SUPERclasses in its throws clause. It cannot declare NO exception nor subclass of the exception thrown from
 * superclasses constructor!
 *
 * The reason is that this() or superclass constructor call is always the first statement in sub's constructor and for
 * example cannot be wrapped in trycatch.
 *
 * (This is actually opposite from the methods)
 */
public class ExFromConstructor {

    public ExFromConstructor() throws IOException {
    }

    public static void main(String[] args) {

    }
}

class Subex extends ExFromConstructor {

    //ex declared here must be IOException or ANY of its superlcasses + other exceptions are allowed, but NOT SUBLCASSESS of IOException
    public Subex() throws Exception /*can't throw NO ex, nor subclass of IOE like FileNotFoundException */ {
    }
}
