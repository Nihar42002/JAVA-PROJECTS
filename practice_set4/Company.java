// Base Class
class Employee {

    String name;
    String department;

    // Constructor
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass
class Manager extends Employee {

    int teamSize;
    String projectName;

    // Constructor
    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department); // call parent constructor
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Overriding method
    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

// Main Class
public class Company {
    public static void main(String[] args) {

        // Object of Employee
        Employee emp = new Employee("Nihar", "Finance");
        emp.displayDetails();

        System.out.println("----------------------");

        // Object of Manager
        Employee mgr = new Manager("Rahul", "IT", 10, "AI Project");
        mgr.displayDetails();   // Runtime Polymorphism
    }
}
