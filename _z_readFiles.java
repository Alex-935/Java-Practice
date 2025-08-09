import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class _z_readFiles {
    
    public static void main(String[] args) {

        /*
          How to read files in Java (3 popular options)

          - BufferedReader + FileReader: Best for reating text files line-by-line
          - FileInputStream: Best for binary files (e.g. images, audio files)
          - RandomAccessFile: Best for read/write specific portions of a large file
        */

        String filePath = "test.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null) { 
                System.out.println(line);
            }
        } 
        catch(FileNotFoundException e) {
            System.out.println("File could not be found");
        }
        catch(Exception e) {
            System.out.println("An error occured");
        }

    }
}
