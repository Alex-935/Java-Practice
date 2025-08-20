import java.util.Random;
import java.util.Scanner;

public class __slotMachine {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        String[] row;
        int payout;
        String playAgain;        
        
        //Welcome
        System.out.println("************************");
        System.out.println("Slot Machine");
        //System.out.println("Symbols: 🍒🍉🍋🔔⭐💸");
        System.out.println("Symbols: X ? ! * $");
        System.out.println("************************");

        //Play if balance > 0
        while (balance > 0) {
            System.out.println("Current balance : £" + balance);
            System.out.print("How much do you want to bet?: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //Enter bet amount
            //bet > 0, bet < balance, sub bet from balance
            if (bet > balance) {
                System.out.println("Insufficient Funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("Invalid Bet");
                continue;
            } else {
                balance -= bet;
            }

            //spin slot
            System.out.println("Spinning...");
            row = spinRow();
            //display slot
            printRow(row);
            //payout
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("Congratulations, you won £" + payout);
                balance += payout;
            } else {
                System.out.println("Too bad. Better luck next time");
            }

            //play again
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("y")) {
                break;
            }
        }

        //exit
        System.out.println("Thank you for playing, your final balance is £" + balance);

        scanner.close();
    }

    static String[] spinRow() {

        Random random = new Random();

        //String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐", "💸"};
        String[] symbols = {"X","X","X","X", "X", "X", "#", "#", "#", "#", "#", "?", "?", "?", "?", "!", "!", "!", "*", "*", "$"};
        //String[] symbols = {"X", "?", "!", "*", "$"};
        String[] row = new String[3];
        
        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("***********");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***********");
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {

            return switch(row[0]) {

                case "X" -> bet * 3;
                case "#" -> bet * 5;
                case "?" -> bet * 10;
                case "!" -> bet * 15;
                case "*" -> bet * 25;
                case "$" -> bet * 50;
                default -> 0;
            };
        } else if (row[0].equals(row[1]) || row[1].equals(row[2]) ) {

            return switch(row[1]) {

                case "X" -> bet * 2;
                case "#" -> bet * 3;
                case "?" -> bet * 5;
                case "!" -> bet * 8;
                case "*" -> bet * 15;
                case "$" -> bet * 25;
                default -> 0;
            };
        }
        return 0;
    }
}
