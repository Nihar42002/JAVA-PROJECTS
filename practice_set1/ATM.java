import java.util.Scanner;

public class ATM {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM");
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
         
        if(amount<0)
        {
            System.out.println("Invalid amount. Please enter a positive amount in multiples of 10.");
        }
        else
        {
            int Hundred = amount / 100;
            amount = amount % 100;
            int Fifty = amount / 50;
            amount = amount % 50;
            int Ten = amount / 10;  
            amount = amount % 10;
            int five = amount / 5;
            amount = amount % 5;
            int two = amount / 2;
            amount = amount % 2;
            int one = amount / 1;
        

            System.out.println("Denominations:");
            System.out.println("100s: " + Hundred);
            System.out.println("50s: " + Fifty);
            System.out.println("10s: " + Ten);
            System.out.println("5s: " + five);
            System.out.println("2s: " + two);
            System.out.println("1s: " + one);

            int totalNotes = Hundred + Fifty + Ten + five + two + one;
            System.out.println("Total number of notes dispensed: " + totalNotes);
        }
            scanner.close();
    }
    
}
