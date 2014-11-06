package ocpjse7.processed;

public class InnerDemo {

    private static int privateStaticField;
    private int privateField;

    public static void main(String[] args) {

    }

    public static class StaticNestedClass {

        //1) CAN declare nonconstant static fields (the other 3 types CAN'T)
        private static int innerStatic;

        public void printStatic() {
            System.out.println(privateStaticField); //2) Have access to all private members of outer
        }
        //3) Does not have access to outer instance fields, only static
        //public void printField() {
        //    System.out.println(privateField);
        //}
    }

    public class InnerClass {
        //4) Inner classes can't declare any non-final static fields (only final)
        //private static int innerStaticNonFinal; // does not compile
        private static final int innerStatic = 10;

        public void printStatic() {
            System.out.println(privateStaticField);
        }

    }

    public void m() {
        class LocalInnerClass {

        }
    }

    private interface I {
    }

    private I i = new I() { //Anonymous inner
        //5) Can't declare explicit constructor
    };
}
