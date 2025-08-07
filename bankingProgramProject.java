import java.util.Scanner;

public class bankingProgramProject {
    
    //makes scanner part of the class scope
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double balance = 0.00;
        int choice;
        boolean isRunning = true;


        while (isRunning) {
            //display menu
            System.out.println("-------------------");
            System.out.println("Banking Program");
            System.out.println("-------------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("-------------------");


            //get and process users choice
            System.out.print("Please enter the option you would like (1-4): ");
            choice = scanner.nextInt();

            switch(choice) {
                
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> {
                    System.out.println("-------------------");
                    System.out.println("Thank You for choosing Starlight Banking");
                    System.out.println("-------------------\n");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Option");
            }
           
        }

        scanner.close();
    }

    //showBalance()
    static void showBalance(double balance) {
        System.out.printf("Your balance is £%.2f.\n", balance);
    }

    //deposit()
    static double deposit() {
        System.out.print("How much do you want to deposit: ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return 0;
        } else {
            return amount;
        }
    }

    //withdraw()
    static double withdraw(double balance) {
        System.out.print("How much do you wish to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("You do not have enough funds");
            return 0;
        } else if (amount < 0) {
            System.out.println("Invalid Amount");
            return 0;
        } else {
            return amount;
        }
        
    }
}
