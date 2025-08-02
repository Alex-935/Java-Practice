import java.util.Scanner;

public class interestCalculator {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the starting ammount: ");
        double startAmount = scanner.nextDouble();

        System.out.print("Please enter the interest rate as a percentage: ");
        double interest = scanner.nextDouble();

        System.out.print("Please enter the number of compounds per year: ");
        int compounds = scanner.nextInt();

        System.out.print("Please enter the number of years: ");
        int years = scanner.nextInt();

        scanner.close();

        double total = startAmount * Math.pow((100 + interest / compounds)/100 , compounds * years);
        System.out.printf("The amount after %d years is: £%.2f\n", years, total);
    
    }
}
