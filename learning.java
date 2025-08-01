import java.util.Scanner;

public class learning {

    public static void main(String[] args) {
        
        loops();
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
}