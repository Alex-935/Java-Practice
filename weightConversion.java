import java.util.Scanner;

public class weightConversion {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome, this program offers you two choices:\n" +
            "Option 1: Convert Kgs to lbs\n" + 
            "Option 2: Convers lbs to Kgs\n");

        boolean accept = false;
        int option = 0;

        while (!accept) {

            System.out.println("Which option would you like, 1 or 2: ");
            option = scanner.nextInt();

            if (option == 1 || option == 2) {
                accept = true;
            } else {
                System.out.println("Please enter 1 or 2");
            }
        }

        double weight;
        double newWeight;

        System.out.print("What is the current weight? ");
        weight = scanner.nextDouble();

        if (option == 1) {
            newWeight = weight * 2.20462;
            System.out.println("The weight in lbs is: " + newWeight);

        } else {
            newWeight = weight * 0.453592;
            System.out.println("The weight in Kgs is: " + newWeight);
        }

        scanner.close();
    }
}
