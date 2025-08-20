import java.util.Scanner;

public class hypotenuse {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Please enter the value of b: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("The hypotenuse is: %.2fcm.", c);

        scanner.close();
    }
}
