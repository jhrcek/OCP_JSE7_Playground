package ocajse7;

public class PrimitiveWrappers {

    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        Integer i3 = 1;
        int i4 = 1;
        System.out.println(i1 == i2); //false
        System.out.println(i1 == i3); //false

        System.out.println(i1 == i4); //true - because wrapped is Unboxed
    }
}
