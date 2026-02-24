package practice_set6;

public class method_avaerage {
    
    public static double method_aveerage(String[] values)
    throws NullPointerException, NumberFormatException
    {

        double sum = 0.0;

        for(String val : values){

            if(val == null){
                throw new NullPointerException("Null value found in the array.");

            }
            else{
                double num = Double.parseDouble(val);
                sum += num;
            }
           
        }
       return sum / values.length;
    }

    public static void main(String[] args){

        String[] Right_val = {"10", "20", "30", "40", "50"};

        String[] Wrong_val = {"bc", "20","abc", "40", "50"};

        String [] Null_val = {"10", "20", null, "40", "50"};

        try{
            double average = method_aveerage(Right_val);
            System.out.println("The average of the values is: " + average);
        }
        catch(Exception e){
            System.out.println("Error: Invalid number format in the array."+ e.getMessage());
        }
        finally{
            System.out.println("This block is executed regardless of exceptions.");
                 System.out.println("------------------------------");
        }

        try{
            double average = method_aveerage(Wrong_val);
            System.out.println("The average of the values is: " + average);
        }
        catch(NumberFormatException e){
            System.out.println("Error: Invalid number format in the array."+ e.getMessage());
        }
        finally{
            System.out.println("This block is executed regardless of exceptions.");
                 System.out.println("------------------------------");
        }

        try{
            double average = method_aveerage(Null_val);
            System.out.println("The average of the values is: " + average);
        }
        catch(NullPointerException e){
            System.out.println( e.getMessage());
        }
        finally{
            System.out.println("This block is executed regardless of exceptions.");
                 System.out.println("------------------------------");
        }

    }
}
