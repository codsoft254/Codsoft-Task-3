package steveOwino.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //CODSOFT TASK 3.

//    1.Create a class to represent the ATM machine.
//
//    2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
//    checking the balance.
//
//    3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
//    checkBalance().
//
//    4. Create a class to represent the user's bank account, which stores the account balance.
//
//    5. Connect the ATM class with the user's bank account class to access and modify the account
//    balance.
//
//    6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
//
//    7. Display appropriate messages to the user based on their chosen options and the success or failure
//    of their transactions.
//
//                     ATM INTERFACE

        Account stevesAccount = new Account(0);

        //
        ATM atmMachine = new ATM(stevesAccount);


        while (true) {
            try {
                // Display ATM menu
                atmMachine.displayMenu();

                // Get user input for menu option
                System.out.println("Enter option (1-4):");
                int option = scanner.nextInt();

                // Process the chosen option
                atmMachine.processOption(option);
                // I have not classed the scanner here .reason:
                // Note: In this example, the program doesn't reach this point because of the infinite loop
                //in this example, we assume that the program will be terminated externally.
                // scanner.close();
            }catch (InputMismatchException exception){
                System.out.println("Invalid Option,try again.");
                scanner.nextLine();

            }
        }
    }
}
