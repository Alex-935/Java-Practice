import java.util.Scanner;

public class shoppingCart {
    
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '£';
        double total = 0.00;

        System.out.print("Please enter an item: ");
        item = scanner.nextLine();

        System.out.print("Please enter the price: ");
        price = scanner.nextDouble();

        System.out.print("How many do you want: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.printf("Your total is: " + currency + "%.2f", total);

        scanner.close();
    }
}
