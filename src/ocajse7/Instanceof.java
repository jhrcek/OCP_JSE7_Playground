package ocajse7;

/**
 *
 * @author jhrcek
 */
public class Instanceof {

    public static void main(String[] args) {
        XX x = new XX();
        System.out.println(x instanceof II);
    }
}

class AA {

}

class BB extends AA implements II {
}

class XX {

}

interface II {
}
