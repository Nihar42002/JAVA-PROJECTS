package practice_set6;

class  NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

public class BankAccount{
    private double balance;

    BankAccount(double initialBalance){
        if(initialBalance < 0){
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            initialBalance = 0;
        }
        this.balance = initialBalance;
    }
      
    void deposit(double amount){
        if(amount < 0){
            System.out.println("Deposit amount cannot be negative.");
            return;
        }
        balance += amount;
    } 

    void withdraw(double amount) throws NotSufficientFundException { 
      try{
        
       if(amount < 0){
            System.out.println("Withdrawal amount cannot be negative.");
        }
        if(amount > balance){
            throw new NotSufficientFundException("Insufficient funds. Withdrawal denied.");
        }
        balance -= amount;
    }
    catch(NotSufficientFundException e){
        System.out.println(e.getMessage());
    }
 }

 public static void main(String[] args){

    BankAccount account = new BankAccount(1000);
    System.out.println("Initial Balance: " + account.balance);
    System.out.println("------------------------------");

    account.deposit(500);
    System.out.println("Balance after deposit of 500: " + account.balance);
        System.out.println("------------------------------");


    try{
        account.withdraw(400.00);
        System.out.println("Balance after withdrawal of 400: " + account.balance);
            System.out.println("------------------------------");


        account.withdraw(300.00); // This will trigger the NotSufficientFundException
        System.out.println("Balance after withdrawal of 300: " + account.balance);
            System.out.println("------------------------------");


        
        account.withdraw(500.00); // This will trigger the NotSufficientFundException
        System.out.println("Balance after withdrawal of 500: " + account.balance);
            System.out.println("------------------------------");


        
        account.withdraw(1500.00); // This will trigger the NotSufficientFundException
        System.out.println("Balance after withdrawal of 1500: " + account.balance);
            System.out.println("------------------------------");

    }
    catch(NotSufficientFundException e){
        System.out.println(e.getMessage());

    }
    finally{
        System.out.println("Final Balance: " + account.balance);
    }
 }

}
