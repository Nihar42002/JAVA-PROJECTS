class Baccount{
    int accountNumber;
    String accountHolderName;
    double balance;

   void openAccount(int accountNumber, String accountHolderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        System.out.println("Account opened successfully");
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Amount deposited successfully :"+amount);
    }

    void  withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println("Amount withdrawn successfully: "+amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance(){
        System.out.println("Current balance: "+balance);
    }
}

class SavingAccount extends Baccount{
    int interestRate = 5;

    void calculateInterest(){
        double interest = balance * interestRate / 100;
        System.out.println("Interest amount: "+interest);
    }
}

class FixedDepositAccount extends Baccount{
int InterestRate = 7;
int years;

    void maturityAmount(int years) {
        this.years = years;
        double maturity = balance * Math.pow((1 + InterestRate / 100), years);
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}

public class BankAccount {
    public static void main(String[] args){
        SavingAccount sa = new SavingAccount();
        sa.openAccount(12345, "John Doe", 1000);
        sa.deposit(500);
        sa.withdraw(200);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

        FixedDepositAccount fda = new FixedDepositAccount();
        fda.openAccount(67890, "Jane Smith", 2000);
        fda.maturityAmount(5);

    }
    
}
