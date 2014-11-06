package ocajse7;

/**
 *
 * @author jhrcek
 */
public class Ex1 implements MyI {

    public void test() throws Exception {
    }
}

class Ex2 extends Ex1 implements MyI {

    public void test(String s) {
    }

    public static void main(String[] args) throws Exception {
        Ex1 e = new Ex2();
        e.test();
        Ex2 e2 = (Ex2) e;
        e2.test("s");
    }
}

interface MyI {
}
