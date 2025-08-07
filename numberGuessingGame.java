import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randNum = random.nextInt(1, 101);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the number guessing game");

        do {

            System.out.print("Please guess a number between 1 and 100: ");
            guess = scanner.nextInt();

            if (guess < randNum) {
                System.out.println("Higher!");
            } else if (guess > randNum) {
                System.out.println("Lower!");
            }

            attempts ++;
            
        } while (guess != randNum);

        System.out.println("\nCongratulations!, you guessed the number.\n" +
            "You took " + attempts + " guesses.\n");
        
        scanner.close();
    }
}
