import java.util.Random;
import java.util.Scanner;

public class diceRollerProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int total = 0;

        System.out.print("How many dice do you want to use: ");
        int numDice = scanner.nextInt();

        if (numDice > 0) {
            
            for (int i = 0; i < numDice; i++) {
                
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled " + roll);
                total += roll;
            }

            System.out.println("Your total is " + total);

        } else {
            System.out.println("Invalid number of dice.");
        }

        scanner.close();
    }

    static void printDie(int roll) {

        switch(roll) {

            case 1 -> {
                System.out.print("""
                         -------
                        |       |
                        |   ●   |
                        |       |
                         -------
                        """);
            }
            case 2 -> {
                System.out.print("""
                         -------
                        | ●     |
                        |       |
                        |     ● |
                         -------
                        """);
            }
            case 3 -> {
                System.out.print("""
                         -------
                        | ●     |
                        |   ●   |
                        |     ● |
                         -------
                        """);
            }
            case 4 -> {
                System.out.print("""
                         -------
                        | ●   ● |
                        |       |
                        | ●   ● |
                         -------
                        """);
            }
            case 5 -> {
                System.out.print("""
                         -------
                        | ●   ● |
                        |   ●   |
                        | ●   ● |
                         -------
                        """);
            }
            case 6 -> {
                System.out.print("""
                         -------
                        | ●   ● |
                        | ●   ● |
                        | ●   ● |
                         -------
                        """);
            }
            default -> System.out.println("Invalid roll");

        }
    }
}
