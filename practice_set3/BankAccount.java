class Bank{
static double interestRate=7.0;
String accountHolderName;
int Balance;

void getHolderInfo(String name, int Balance){
accountHolderName = name;
this.Balance = Balance;
System.out.println("Account Holder Info: " + accountHolderName + ", Balance: " + Balance);
int interestRateEarned = (int)(Balance * interestRate/100);
System.out.println("Interest earned: " + interestRateEarned);
System.out.println("-----------------------------");
}
static void setInterestRate(double rate){
interestRate = rate;
   }
}

public class BankAccount {
    public static void main(String[] args){
Bank b1 = new Bank();
b1.getHolderInfo("Alice", 1000);
Bank.setInterestRate(5.0);
Bank b2 = new Bank();
b2.getHolderInfo("Bob", 2000);

    }
    
}
