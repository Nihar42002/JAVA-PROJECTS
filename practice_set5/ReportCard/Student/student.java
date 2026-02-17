package ReportCard.Student;

public class student {
    
    protected int rollNo;
    protected String name;

    // Constructor
    public student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
