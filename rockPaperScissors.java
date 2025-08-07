import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice;
        String compChoice;
        String playAgain = "y";

        do{
            System.out.print("Please enter your choice: ");
            playerChoice = scanner.nextLine().toLowerCase();
            playerChoice = playerChoice.substring(0, 1).toUpperCase() + playerChoice.substring(1);

            if (!playerChoice.equals("Rock") &&
                !playerChoice.equals("Paper") &&
                !playerChoice.equals("Scissors")) {
        
                System.out.println("Invalid Input");
                continue;
            }

            compChoice = choices[random.nextInt(3)];
            System.out.println("The computer picked " + compChoice);

            if (playerChoice.equals(compChoice)) {
                System.out.println("You have tied!");
            } else if (playerChoice.equals("Rock") && compChoice.equals("Scissors") ||
                playerChoice.equals("Paper") && compChoice.equals("Rock") ||
                playerChoice.equals("Scissors") && compChoice.equals("Paper")) {
                
                System.out.println("ongratulations, you have won!");
                
            } else {
                System.out.println("You have lost!");
            }

            System.out.print("Do you want to play again (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();

        
        } while (playAgain.equals("y"));

        System.out.println("Thank you for playing.");
        
        scanner.close();
    }
}
