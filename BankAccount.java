public class BankAccount {
    private double balance;    // Account balance
    public BankAccount(double openingBalance)   // Constructor
    {
        balance = openingBalance;
    }
    public void deposit(double amount)    // makes deposit
    {
        balance = balance + amount;
    }
    public void withdrawal(double amount)    // makes withdrawal
    {
        balance = balance - amount;
    }
    public void display()     // Displays balance
    {
        System.out.println("Balance : "+balance);
    }
}

class BankApp
{
    public static void main(String[] args) 
    {
        BankAccount bal1 = new BankAccount(100.0);
        System.out.println("Before Transaction : ");
        bal1.display();

        bal1.deposit(50.0);
        bal1.withdrawal(60.0);

        System.out.println("After Transaction : ");
        bal1.display();
    }
}