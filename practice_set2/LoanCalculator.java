import java.util.Scanner;

class LoanMethods {

 void calculateEMI(int principal, int time, float rate)
 {
    int emi = (int)(principal * rate * time) / 100;
    System.out.println("EMI: " + emi);
 }

void calculateEMI(double principal, int time, double rate)
  {
    double emi = (double)(principal * rate * time) / 100;
    System.out.println("EMI: " + emi);
  }

  void calculateEMI(int principal, int time)
  {
    int rate = 10;
    int emi = (principal * rate * time) / 100;
    System.out.println("EMI: " + emi);
  }
}
public class LoanCalculator {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter principal amount:");
    int principal = sc.nextInt();
    System.out.print("Enter time period:");
    int time = sc.nextInt();
    System.out.print("Enter rate of interest:");
    double rate = sc.nextDouble();

    System.out.println("Choose an option to calculate EMI:");
    System.out.println("1.For short-term personal loans with a fixed interest\r\n" + //
                "rate of 10%");
    System.out.println("2. For home loans");
    System.out.println("3. For vehicle loans"); 
    System.out.println("---------------------------------");
    System.out.print("Enter your choice:");
    int choice = sc.nextInt();           
    LoanMethods lc = new LoanMethods();
   
    switch (choice){
        case 1:
            lc.calculateEMI(principal, time);
            break;
        case 2:
            lc.calculateEMI(principal, time, (float)rate);
            break;
        case 3:
            lc.calculateEMI((double)principal, time, rate);
            break;
        default:
            System.out.println("Invalid choice");
            break;  
    }
    sc.close();
}
    
}
