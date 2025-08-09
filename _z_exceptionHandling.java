import java.util.InputMismatchException;
import java.util.Scanner;

public class _z_exceptionHandling {
    
    public static void main(String[] args) {

        /*
          Exception = An event that interrupts the normal flow of a program
                      (Dividing by zero, file not found, mismatch input type)
                      Surround any dangerous code with a try block
                      try{}, catch{}, finally{}
        */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(1/0);

            //catch(typeOfError nickname)
        } catch(ArithmeticException e) {
            System.out.println("You cannot divide by zero!");
        }


        //import java.util.InputMismatchException;
        try {
            System.out.print("Please enter a number: ");
            int num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("That's not a number");

            //catch all exceptions
        } catch(Exception e) {
            System.out.println("An error was raised");
        } 
        //will execute whether there is an exception or not
        finally {
            System.out.println("This always executes");
            scanner.close();
        }
        
    }
}
