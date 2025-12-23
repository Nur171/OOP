
public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private double balance;
    private static int totalAccounts = 0;
    private static final double MIN_BALANCE = 0.0;
    private static final double MAX_WITHDRAW_LIMIT = 2000.0 ;

    public BankAccount(String ownerName, double initialDeposit){
        this.ownerName = ownerName;
        if (initialDeposit< MIN_BALANCE){
            this.balance = MIN_BALANCE;
        }else{
            this.balance = initialDeposit;
        }
        totalAccounts++;
        accountNumber = 100000 + (int) (Math.random() * 900000);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount>0){
            balance += amount;
        }else{
            System.out.println("Deposit amount must be positive");
        }

    }

    public void withdraw(double amount){
        if ((amount > 0) & (amount <= MAX_WITHDRAW_LIMIT ) & (balance > MIN_BALANCE) ){
            balance -= amount;
        }else{
            System.out.println("You can not withdraw");
        }
    }

    public static int getTotalAccounts(){
        return totalAccounts;
    }

    public String getInfo(){
        return "Account Number: " + accountNumber +
                "\nOwner Name: " + ownerName +
                "\nBalance: " + balance +
                "\nTotal Accounts: " + totalAccounts;
    }

}
