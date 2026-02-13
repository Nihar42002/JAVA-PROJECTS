import java.util.*;

class Clg{
    String collegeName;

    Clg(String name){
        collegeName = name;
    }
   
    class admmision{
        String studentName;
        String course;

void AcceptStudent(){
Scanner scanner = new Scanner(System.in);
 System.out.println("Enter Student Name");
studentName = scanner.nextLine();
System.out.println("Enter Course Name");
 course = scanner.nextLine();
scanner.close();
        }

       void displayDetails(){
            System.out.println("College: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class collage {
    public static void main(String[]args){
        Clg c = new Clg("SVIT College");
        Clg.admmision adm = c.new admmision();
        adm.AcceptStudent();
        adm.displayDetails();

    }
    
}
