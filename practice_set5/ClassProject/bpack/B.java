package ClassProject.bpack;
import ClassProject.apack.A;

public class B extends A {

    public B(){
        super(10, 20, 30); // Call parent constructor to initialize variables
    }

    public void display() {
        System.out.println("Access in subclass (B):");
        System.out.println("Public Variable: " + pubVar); // Accessible
        System.out.println("Protected Variable: " + protVar); // Accessible
        // System.out.println("Private Variable: " + privVar); // Not accessible, will cause error
    }
}
