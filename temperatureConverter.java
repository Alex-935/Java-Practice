import java.util.Scanner;

public class temperatureConverter {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the temperature: ");
        double temp = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Do you want to convert to Celcius of Fahrenheit?\nPlease enter C or F: ");
        String mode = scanner.nextLine().toUpperCase();

        double newTemp = (mode.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("The converted temperature is: %.1f°%s", newTemp, mode);

        scanner.close();
    }
}
