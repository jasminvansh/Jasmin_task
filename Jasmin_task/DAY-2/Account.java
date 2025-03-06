
public class Account{
   private String accountNumber;
   private double balance;


public  Account(String accountNumber,double balance){

    if(accountNumber == null || accountNumber.isEmpty()){
System.out.println("Account Number Can not empty or null");
    }

    else{
        this.accountNumber =accountNumber;
    }

    if(balance < 0){
        System.out.println("Error:- acccount balance can not nagative");
    }

    else{
        this.balance = balance;
    }
}
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Account account1 = new Account("123",500);
        if(account1.getAccountNumber() != null){
            System.out.println("Account NUmber:-" + account1.getAccountNumber());
            System.out.println("Balance:-" + account1.getBalance());

            Account account2 = new Account(null, 200.0);
        }
    }
}
