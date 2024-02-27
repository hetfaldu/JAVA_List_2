public class Account {
 
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;
    
    
    public Account(String depositorName, int accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }
    
 
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println(amount + " Rp deposited successfully.");
        }
    }
    
    public void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Balance: " + balance + " Rp");
    }
    

    public static void main(String[] args) {
     
        Account acc = new Account("Abhi", 324561, "Savings", 1500);
        
     
        acc.display();
        

        acc.deposit(500);
        
        
        acc.display();
    }
}
