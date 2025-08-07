import java.util.Scanner;

public class quizGame {
    
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was facebook launched?",
                              "Who is known as the father of computers?",
                              "What was the first programming language?"};
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2002", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COLBALT", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;

        System.out.println("**************************");
        System.out.println("Welcome to the Quiz Game");
        System.out.println("**************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Please enter your guess:");
            int guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("------------------------");
                System.out.println("Correct!");
                System.out.println("------------------------");
                score += 1;
            } else {
                System.out.println("------------------------");
                System.out.println("Sorry, that was wrong");
                System.out.println("------------------------");
            }
        }

        System.out.println("**************************");
        System.out.printf("Your final score was %d out of 5.\n", score);
        System.out.println("**************************");

        scanner.close();

        
    }
}
