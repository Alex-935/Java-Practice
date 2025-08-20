import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class __musicPlayer {
    
    public static void main(String[] args) {
        
        //How to play Audio in Java

        String filePath = "A Real Hero.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            String response = "";

            while (!response.equals("Q")) { 

                System.out.println("P: Play");
                System.out.println("S: Stop");
                System.out.println("R: Reset");
                System.out.println("Q: Quit");
                System.out.print("Please select an option: ");

                response = scanner.nextLine().toUpperCase();

                switch (response) {
                   
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice.");
                }
                
            }
        } 
        catch(FileNotFoundException e) {
            System.out.println("File could not be found");
        }
        catch(UnsupportedAudioFileException e) {
            System.out.println("This file type is not supported");
        }
        catch(LineUnavailableException e) {
            System.out.println("File could not be accessed");
        }
        catch (IOException e) {
            System.out.println("An error occured");
        }
        finally {
            System.out.println("Thank you for using the program");
        }

        
    }
}
