import java.util.Scanner;

public class checking_vowels {

    public static void main(String[] args)
    {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
        {
            System.out.println(ch + " is a vowel.");
        } 
   else if((ch >=32 && ch<=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=126))
         {
            System.out.println(ch + " is a special character.");
         }
    else if(ch>=48 && ch<=57)
         {
            System.out.println(ch + " is a digit.");
         }
        else
         {
            System.out.println(ch + " is a Consonant.");
        }
        scanner.close();
    }
    
}
