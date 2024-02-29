
package steveOwino.com;

//class Account
public class Account {

    // instance variable to store the account balance
    private double balance;

    // Bellow is a constructor
    // it initializes the account with an initial balance
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter method to get the current account balance
    public double getBalance() {
        return this.balance;
    }

    // Deposits method into the account
    public void deposit(double depositAmount) {
        // Increase the balance by the deposit amount
        this.balance += depositAmount;
        // Print a message confirming the deposit and displaying the new balance
        System.out.println("Deposit of " + depositAmount + "$ made. New balance is " + this.balance + "$");
    }

    // Withdrawal method from the account
    public void withdraw(double withdrawalAmount) {
        // Check if there are sufficient funds to complete the withdrawal
        if (this.balance - withdrawalAmount < 0) {
            // Print a message indicating insufficient funds if the withdrawal cannot be processed
            System.out.println("Only " + this.balance + "$ available. Withdrawal not processed.");
        } else {
            // Deduct the withdrawal amount from the balance if there are sufficient funds
            this.balance -= withdrawalAmount;
            // Print a message confirming the withdrawal and displaying the remaining balance
            System.out.println("Withdrawal of " + withdrawalAmount + "$ processed. Remaining balance is " + this.balance + "$");
        }
    }
}





