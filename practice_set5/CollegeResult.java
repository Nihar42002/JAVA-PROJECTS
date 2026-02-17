interface Exam{

boolean isPassed(int mark);
}

interface AverageMarks{
    String getDivision(double average);
}

class CollegeResultImpl implements Exam, AverageMarks{

    public boolean isPassed(int marks){
        return marks >= 40;
    }

    public String getDivision(double average){
        if(average >= 60){
            return "First Division";
        } else if(average >= 50){
            return "Second Division";
        } else if(average >= 40){
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class CollegeResult {
    public static void main(String[] args){

        int marks1 = 75;
        int marks2 = 87;
        int marks3 = 55;

        double average = (marks1 + marks2 + marks3) / 3.0;

        CollegeResultImpl result = new CollegeResultImpl();
        String division = result.getDivision(average);
        boolean passed = result.isPassed(marks1) && result.isPassed(marks2) && result.isPassed(marks3);

        System.out.println("Average Marks: " + average);
        System.out.println("Division: " + division);
        System.out.println("Passed: " + passed);

    }
    
}
