import java.util.Scanner;

public class BMI {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight In pounds:");
        double weight = scanner.nextDouble();
        System.out.print("Enter height In inches:");
        double height = scanner.nextDouble();

       double wr =(int)(weight* 0.45359237);
       double hr =(int)(height*0.0254);

         double bmi = (double)(wr/(hr*hr));

        System.out.println("Your BMI is: " + bmi);
        scanner.close();

    }
}
