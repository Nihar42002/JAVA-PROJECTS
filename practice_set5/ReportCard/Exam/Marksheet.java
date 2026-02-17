package ReportCard.Exam;

public class Marksheet {
    
    public static void main(String[] args) {

        result r = new result(101, "Nihar", 85, 90, 78);

        System.out.println("----- Student Mark Sheet -----");
        r.displayResult();
    }
}
