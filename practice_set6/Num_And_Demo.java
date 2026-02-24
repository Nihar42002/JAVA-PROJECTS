package practice_set6;

public class Num_And_Demo {
    public static void main(String[] args){
        
      
        try{
            int args0 = Integer.parseInt(args[0]);
            int args1 = Integer.parseInt(args[1]);
            int Divide = args0 / args1;
            System.out.println("The division of the two arguments is: " + Divide);   
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please ensure both arguments are valid integers.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two arguments.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        
    }
}
