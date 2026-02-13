import java.util.Scanner;

public class meter_to_feet_1_1 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value in meters: ");
        double meters = scanner.nextDouble();

        double feet = meters * 3.28084;

        System.out.println(meters + " meters is equal to " + feet + " feet.");
        scanner.close();
    }
    
}
