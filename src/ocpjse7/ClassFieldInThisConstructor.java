package ocpjse7;

public class ClassFieldInThisConstructor {

    int x = 0;

    public ClassFieldInThisConstructor() {
        //this(x); //TODO: why won't compile
    }

    public ClassFieldInThisConstructor(int x) {
        this.x = x;
    }
}
