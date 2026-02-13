class Bank{
    String AccountId;
    String AccountHolderName;
    double balance;

  void assignValues(String id, String name, double initialBalance){
        AccountId = id;
        AccountHolderName = name;
        balance = initialBalance;
    }

    void displayAccountInfo(){
        System.out.println("Account ID: " + AccountId);
        System.out.println("Account Holder Name: " + AccountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("---------------------------");
    }
  
    static void searchById(Bank[] account , String Searchid){
        boolean found = false;

        for ( int i = 0; i < account.length; i++) {
            if(account[i].AccountId.equals(Searchid)){
                System.out.println("Account found:");
                account[i].displayAccountInfo();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Account with ID " + Searchid + " not found.");
        }
    }
    
}

public class BankAccount {
    public static void main(String[] args){

        Bank[] account = new Bank[5];

        for(int i=0; i<account.length; i++){
            account[i] = new Bank();
            account[i].assignValues("ID00"+(i+1), "Holder"+(i+1), 1000*(i+1));
        }
        for(int i=0; i<account.length; i++){
            account[i].displayAccountInfo();
        }

        Bank.searchById( account, "ID007");


    }
    
}
