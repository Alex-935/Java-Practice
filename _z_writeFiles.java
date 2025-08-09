import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class _z_writeFiles {
    
    public static void main(String[] args) {

        /*Write a file using Java (4 popular options)
            - FileWriter = Good for small or medium-sized text files
            - BufferedWriter = Better performance for large amounts of text
            - PrintWriter = Best for structured data, like reports or logs
            - FileOutputStream = Best for binary files (e.g. images, audio files)
        */

        String filePath = "test.txt";
        String writeText = """
                Roses are red,
                Violets are blue,
                Don't mess with Po,
                Because he knows Kung-Fu.
                """;

        try(FileWriter writer = new FileWriter(filePath);) {
            
            writer.write(writeText);
            System.out.println("File has been written");
        } 
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }
        catch(IOException e) {
            System.out.println("Could not write file");
        }
        catch(Exception e) {
            System.out.println("An error occured");
        }


    }
}
