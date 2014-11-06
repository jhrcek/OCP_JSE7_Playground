package ocajse7;

public class Covariance {

    short m() {
        return 1;
    }
}

class Sub extends Covariance {

    /**
     * @return RETURN TYPE CANNOT BE BYTE - not compatible
     */
    short m() {
        return 2;
    }

    public static void main(String[] args) {
        int i, j, k;
        i = j = k = 9;
        System.out.println(j);

        Covariance[] a = new Covariance[10];
        Sub[] b = new Sub[10];

        a = b;

        b = (Sub[]) a;

    }
}
