package BankAccountApp;
import BankModels.BankAccount;
import javax.swing.JOptionPane;

public class BankAccountApp {
    
    public static void main(String[] args) {
       
        String name = JOptionPane.showInputDialog("Enter the account name:");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter the initial balance:"));
    
        BankAccount account1 = new BankAccount(name, balance);
        BankAccount account2 = new BankAccount(name);

       
        double initialBalance = Double.parseDouble(JOptionPane.showInputDialog("Set the balance for the second account:"));
        account2.setBalance(initialBalance);

       
        JOptionPane.showMessageDialog(null, "Account 1 - Name: " + account1.getName() + ", Balance: $" + account1.getBalance());
        JOptionPane.showMessageDialog(null, "Account 2 - Name: " + account2.getName() + ", Balance: $" + account2.getBalance());
 
        double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to withdraw from Account 1:"));
        account1.withdraw(withdrawAmount);

        double depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to deposit to Account 1:"));
        account1.deposit(depositAmount);

        JOptionPane.showMessageDialog(null, "Account 1 - Name: " + account1.getName() + ", Balance: $" + account1.getBalance());
        JOptionPane.showMessageDialog(null, "Account 2 - Name: " + account2.getName() + ", Balance: $" + account2.getBalance());
    }
}
