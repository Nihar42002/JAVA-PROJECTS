import java.util.Scanner;

public class DigitIncrement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit integer: ");
        int num = sc.nextInt();

        // Check if number is five digits
        if (num < 10000 || num > 99999) {
            System.out.println("Error: Please enter a valid five-digit number.");
        } else {

            int original = num;
            int result = 0;
            int place = 1;
            int carry = 0;

            while (num > 0) {

                int digit = num % 10;

                int newDigit = digit + 1 + carry;

                if (newDigit >= 10) {
                    newDigit = newDigit % 10;
                    carry = 1;
                } else {
                    carry = 0;
                }

                result = result + (newDigit * place);

                place = place * 10;
                num = num / 10;
            }

            System.out.println("Original number: " + original);
            System.out.println("New number after incrementing digits: " + result);
        }

        sc.close();
    }
}
