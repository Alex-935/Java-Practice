import java.util.Scanner;

public class createSymbolMatrix {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rows do you want: ");
        int rows = scanner.nextInt();

        System.out.print("How many columns do you want: ");
        int columns = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Please enter the symbol you want to use: ");
        char symbol = scanner.nextLine().charAt(0);

        scanner.close();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                
                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}
