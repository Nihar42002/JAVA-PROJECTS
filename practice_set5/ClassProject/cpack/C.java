package ClassProject.cpack;
import ClassProject.apack.A;

public class C {
    public void display() {
        A a = new A(10, 20, 30);
        
        System.out.println("Access in non-subclass (C) in different package:");
        System.out.println("Public Variable: " + a.pubVar); // Accessible
        // System.out.println("Protected Variable: " + a.protVar); // Not accessible, will cause error
        // System.out.println("Private Variable: " + a.privVar); // Not accessible, will cause error
    }
    
}
