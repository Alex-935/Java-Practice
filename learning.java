import java.util.Random;
import java.util.Scanner;

public class learning {

    public static void main(String[] args) {
        
        mathClass();
    }

    public static void arithmetic() {

        int sumOf = 3 + 4;
        int negOf = 8 - 3;
        int multOf = 3 * 7;
        int divOf = 33 / 8;
        int remainderOf = 35 % 8;

        //Augmented Assignment Operators
        double x = 0;

        x += 3;
        x -= 4;
        x *= 3;
        x /= 2;

        x = 10;
        x %= 2;

        //Increment and Decrement Operators

        x++;
        x--;


        System.out.println(x);
    }


    public static void loops() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        /*
         If you have a nextLine after a nextInt then it will cause
         the value to autofill, add another scanner.nextLine() to prevent it
        */
        scanner.nextLine();

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        
        scanner.close();

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name");
            name = "Charles";
        }
        
        if (age <= 18) {
            System.out.println(name + " is a child");
        } else if (age == 18) {
            System.out.println(name + " is a teenager");
        }else if (age <= 70) {
            System.out.println(name + " is an adult");
        } else {
            System.out.println(name + " is a pensioner");
        }
    }

    public static void randNum() {

        Random random = new Random();
        //by default -2 billion to 2 billion
        //numbers 1-6, param1 is inclusive, param2 exclusive
        int intNum = random.nextInt(1, 7);
        double doubleNum = random.nextInt(1, 101);

        boolean isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        };
    }

    public static void mathClass() {

        double pi = Math.PI;
        double eulers = Math.E;

        double nine = Math.pow(3, 2);
        double three = Math.sqrt(nine);
        double four = Math.abs(-4);
        double five = Math.round(5.13);
        double seven = Math.ceil(6.1);
        double eight = Math.floor(8.1);
        int max = Math.max(5, 12);
        int min = Math.min(7, 3);

        System.out.print(eight);

    }
}