package ocpjse7.processed;

public class InitializationOrder {

    public static void main(String[] args) {
        B b = new B();
    }

    static {
        System.out.println("static initialization block A");
    }

    {
        System.out.println("instance initialization block A");
    }

    public InitializationOrder() {
        System.out.println("constructor A");
    }
}

class B extends InitializationOrder {

    static {
        System.out.println("static initialization block B");
    }

    {
        System.out.println("instance initialization block B");
    }

    public B() {
        System.out.println("constructor B");
    }
}
