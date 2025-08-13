import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class __hangman {
    
    public static void main(String[] args) {

        /* 
        //Pick a random word from list of strings
        //display hidden version of word
        //ask user for input
        //check input against word
            - fill in any correct letters
            - add to gallows if no matches
        //Draw in gallows

        // if incorrect guesses = num
            - agame over
            - reveal word
        
            // play again?
        */

        String filepath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            
            String line;
            while ((line = reader.readLine()) != null) { 
                words.add(line.trim());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        } 
        catch(IOException e) {
            System.out.println("Soemthing went wrong");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(0, words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("********************");
        System.out.println("Welcome to Hangman!");
        System.out.println("********************");

        while (wrongGuesses < 6) {

            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");
            for (Character letter : wordState) {
                System.out.print(letter + " ");
            }

            System.out.print("\nPlease guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.toLowerCase().indexOf(guess) >= 0) {
                System.out.println("Correct guess!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.toLowerCase().charAt(i) == guess) {
                        wordState.set(i, word.charAt(i));
                    }
                }
            } else{
                System.out.println("Wrong guess!");
                wrongGuesses ++;
            }

            if (!wordState.contains('_')) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.print("Word: ");
                for (Character letter : wordState) {
                    System.out.print(letter + " ");
                }
                System.out.println("\nCongratulations, You Win!");

                break;
            }
        }

        if (wrongGuesses >= 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("Game Over!");
            System.out.println("The word was: " + word);
        }

        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses) {

        return switch(wrongGuesses) {

            case 0 -> """
                    


                    """;
            case 1 -> """
                       o


                    """;
            case 2 -> """
                      o
                      |

                    """;
            case 3 -> """
                      o
                     /|

                    """;
            case 4 -> """
                      o
                     /|\\

                    """;
            case 5 -> """
                      o
                     /|\\
                     /
                    """;
            case 6 -> """
                      o
                     /|\\
                     / \\
                    """;
            default -> "";
        };
    }
}
