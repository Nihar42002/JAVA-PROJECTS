import java.util.Scanner;

class ValidPassword { 

    boolean isValid(String password) {
        int digitcount = 0;
        boolean Letter = false;
        boolean Digit = false;

        if(password.length() < 8) {
            return false;
        }

            for(int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if(!Character.isLetterOrDigit(ch)){
                    return false;
                }

                if(Character.isDigit(ch)){
                    digitcount++;
                }

                    if(digitcount >= 2) {
                        Digit = true;
                    }
            }

            return Digit;
        }
      
  }


public class Password {
    public static void main(String[] args) {
        ValidPassword vp = new ValidPassword();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password to validate: ");
        String password = scanner.nextLine();
        scanner.close();
        if(vp.isValid(password)) {
            System.out.println("The password is valid.");
        } 
        else {
            System.out.println("The password is invalid.");
        }
    }
}
