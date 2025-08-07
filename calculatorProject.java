import java.util.Scanner;

public class calculatorProject {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first number: ");
        double number1 = scanner.nextInt();

        System.out.print("Please enter your operator (+, -, *, /, ^): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Please enter your second number: ");
        double number2 = scanner.nextInt();

        double result = 0;
        boolean validOp = true;

        switch (operator) {
            
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if (number2 == 0) {
                    System.out.println("Cannot divide by 0");
                    validOp = false;
                } else {
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default -> {
                System.out.println("You did not enter a valid operation");
                validOp = false;
            }

        }

        if (validOp) {
            System.out.println("The result is: " + result);
        } 
    }
}
