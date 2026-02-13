import java.util.Scanner;

public class cramer_rule_1_2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cramer's Rule Example:");
        System.out.println("For equations: ax + by = e and cx + dy = f");
        System.out.print("Enter a, b, c, d, e, f separated by spaces: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

         scanner.close();
        int D = (int)(a * d - b * c);

        int Dx = (int)(e * d - b * f);
        int Dy = (int)(a * f - e * c);

        if (D != 0) {
            double x = (double) Dx / D;
            double y = (double) Dy / D;
            System.out.println("Unique solution found:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            if (Dx == 0 && Dy == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
           
            return;
        }




    }
    
}
