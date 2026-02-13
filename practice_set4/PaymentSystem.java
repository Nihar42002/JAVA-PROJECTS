import java.util.Scanner;

class Payment{
    void processPayment(int amount){
        System.out.println("Processing payment of amount: " + amount);
    }
}

class CreditCardPayment extends Payment{
    @Override
    void processPayment(int amount){
        System.out.println("Processing credit card payment of amount: " + amount);
    }
}

class UPIPayment extends Payment{
    @Override
    void processPayment(int amount){
        System.out.println("Processing UPI payment of amount: " + amount);
    }
}

public class PaymentSystem {
 public static void main(String[] args) {

    System.out.println("Choose a payment method:");
    System.out.println("1. Credit Card");
    System.out.println("2. UPI");

    Scanner sc = new Scanner(System.in);
    int Choice = sc.nextInt();

    
        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();
        
Payment payment;
 if (Choice == 1) {
            payment = new CreditCardPayment();
            payment.processPayment(amount);
        } else if (Choice == 2) {
            payment = new UPIPayment();
        } else {
            System.out.println("Invalid Choice!");
    sc.close();
            return;
        }

        // Runtime Polymorphism
        payment.processPayment(amount);

        sc.close();

}
}
