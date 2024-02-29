
package steveOwino.com;

import java.util.InputMismatchException;
import java.util.Scanner;

// Class representing the ATM
public class ATM {
    // Scanner object to read user input
    private static final Scanner scanner = new Scanner(System.in);

    // Instance variable to store the user's account information
    private final Account userAccount;

    // Constructor for the ATM class, taking an Account object as a parameter
    public ATM(Account userAccount) {
        this.userAccount = userAccount;
    }

    // Method to display the ATM menu
    public void displayMenu() {
        System.out.println("ATM Machine Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    // Method to process user-selected options
    public void processOption(int option) {
        // Variable (amount) is to store the value that the user will enter
        double amount;

        // Used a try-catch block to handle possible InputMismatchException
        try {
            switch (option) {
                case 1:
                    // Prompt user for withdrawal amount
                    System.out.print("Enter withdrawal amount: ");
                    // Read the amount entered by the user
                    amount = scanner.nextDouble();
                    // Call the withdrawal method of the user's account
                    userAccount.withdraw(amount);
                    break;
                case 2:
                    // Prompt user for deposit amount
                    System.out.print("Enter deposit amount: ");
                    // Read the amount entered by the user
                    amount = scanner.nextDouble();
                    // Call the deposit method of the user's account
                    userAccount.deposit(amount);
                    break;
                case 3:
                    // Display the user's current balance
                    System.out.println("Your current balance is: " + userAccount.getBalance() + "$");
                    break;
                case 4:
                    // Display an exit value and terminate the program
                    System.out.println("Thank you for using ATM machine!");
                    //the bellow (System.exit(0) is a statement
                    // that is used to forcefully terminate the Java Virtual Machine (JVM)
                    //the (0)inside is called a status code. is used to indicate a successful completion
                    //while a non-zero status code signifies an error or abnormal termination.
                    System.exit(0);
                    break;
                default:
                    //  the invalid option message below
                    System.out.println("Invalid option. Please try again.");
            }
            // Catch InputMismatchException if the user enters an invalid input such as a string
        } catch (InputMismatchException exception) {
            // print an error message and consume the invalid input
            System.out.println("Invalid input. Please enter a valid number.");
            //reading and discarding any invalid input that might still be in the
            // input buffer after an exception.
            scanner.nextLine();
        }
    }
}


