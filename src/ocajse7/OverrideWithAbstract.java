package ocajse7;

/**
 *
 * @author jhrcek
 */
public class OverrideWithAbstract {

    public void implemented() {
    }

    public static void main(String[] args) {
        OverrideWithAbstract o = new OverrideWithAbstract();
    }
}

abstract class Subclass1 extends OverrideWithAbstract {

    @Override
    public abstract void implemented();

}
