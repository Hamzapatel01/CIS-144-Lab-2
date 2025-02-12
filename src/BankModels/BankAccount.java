package BankModels;
import javax.swing.JOptionPane;

public class BankAccount {
    private String name;
    private double balance;
    
    public BankAccount(String name) {
        this.name = name;
        this.balance = 0.0; 
    }
    
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            JOptionPane.showMessageDialog(null, "Withdrawal of $" + amount + " was successful.");
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient balance for withdrawal.");
        }
    }

    public void deposit(double amount) {
        if (amount <= 1000) {
            balance += amount;
            JOptionPane.showMessageDialog(null, "Deposit of $" + amount + " was successful.");
        } else {
            JOptionPane.showMessageDialog(null, "Cannot deposit more than $1000.");
        }
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getBalance(){
        return this.balance;
    }
}
