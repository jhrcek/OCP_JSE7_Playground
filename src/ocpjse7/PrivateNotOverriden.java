package ocpjse7;

public class PrivateNotOverriden {

    private void privMeth() {
        System.out.println("priv A");
    }

    void defMeth() {
        System.out.println("def A");
    }

    public static void main(String[] args) {
        PrivateNotOverriden b = new B();
        b.privMeth(); //privMeth REFERS TO PrivateNotOverriden's PRIVATE IMPLEMENTATION! NOT B, because private methods are not inherited and therefore CAN'T BE OVERRIDEN!
    }
}

class B extends PrivateNotOverriden {

    void privMeth() {
        System.out.println("priv B");
    }

    void defMeth() {
        System.out.println("def B");
    }
}
