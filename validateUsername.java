import java.util.Scanner;

public class validateUsername {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your username must be between 4 and 12 characters\n"
         + "Your username must not contain any spaces or underscores");

        System.out.print("Please enter a username: ");
        String username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Your username must be between 4 and 12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Your username must not contain any spaces or underscores");
        }else {
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}
