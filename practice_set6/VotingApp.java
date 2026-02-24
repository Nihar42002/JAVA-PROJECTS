package practice_set6;
import java.util.Scanner;

public class VotingApp {
 
    public void checkEligibility(int age) {
        if (age < 18) {
        throw new IllegalArgumentException( "Age must be 18 or above to vote");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args){
        VotingApp Voting = new VotingApp();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try{
        Voting.checkEligibility(age);
        sc.close();
        }
        catch (IllegalArgumentException e)
         {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally
        {
            System.out.println("Validation process completed.");
        }
        

    }
}
