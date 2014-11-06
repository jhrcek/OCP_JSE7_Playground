/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajse7;

/**
 *
 * @author jhrcek
 */
public class Superclass {

    public Superclass() {
        print();
    }

    public void print() {
        System.out.println("Super");
    }
}

class Subclass extends Superclass {

    private int i;

    public Subclass(int i) {
        this.i = i;
    }

    @Override
    public void print() {
        System.out.println("Sub, i = " + i);
    }
    
    public static void main(String[] args) {
        new Subclass(1);
    }

}
