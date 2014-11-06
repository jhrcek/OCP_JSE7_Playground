package ocajse7;

/**
 *
 * @author jhrcek
 */
public interface MyInterface {

    void a();

    void b();
}

abstract class Impl implements MyInterface {

    @Override
    public void a() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
