import java.util.Random;
import java.util.Scanner;

public class learning {

    public static void main(String[] args) {
        
        switchStatements();
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

    public static void printf() {

        /* printf is used to format an output
         %[flags][width][.precision][specifier-character]

         Specifier Characters:

         string - s
         char - c
         int - d
         double - f (for float)
         boolean - b
        */

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);


        //Flags

        // + = output a plus before the number
        // , = grouping sperator
        // ( = negative numbers will be enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        double price4 = 1345789.543;

        System.out.printf("%.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%.2f\n", price3);
        //order doesnt matter
        System.out.printf("%,+.2f\n", price4);
        System.out.printf("%+,.2f\n", price4);


        //width

        // 0number (e.g 04) = 0 padding (to width of 4)
        // number = right justified padding
        // negative number = left justified pading

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }

    public static void stringMethods() {

        String name = "Obi-Wan Kenobi";
        System.out.println(name.length());

        char secondLetter = name.charAt(1);
        int indexOfL = name.indexOf('l');
        int lastIndexOf = name.lastIndexOf("i");

        String nameUpper = name.toUpperCase();
        String nameLower = name.toLowerCase();

        String nameSpaced = "    Anakin    ";
        String name2 = nameSpaced.trim();

        name2 = name2.replace("Anakin", "Darth Vader");

        name.isEmpty();// returns true or false
        name.contains("a");
        name.equals(name2);
        name.equalsIgnoreCase(name2);

        System.out.printf("%s says: Hello There\n", name);
    }

    public static void substrings() {

        String email = "droideka@photonmail.com";
        //second index exclusive
        String droid = email.substring(0, 8);
        String domain = email.substring(9);

        System.out.println("The droid you are looking for is a " + droid);

        String userEmail = "ServiceDroid@YAOO.com";
        String droidName = userEmail.substring(0, userEmail.indexOf('@'));
        String userDomain = userEmail.substring(userEmail.indexOf('@') + 1);

        System.out.println("Droid: " + droidName + "\nUser Domain: " + userDomain);
    }

    public static void ternaryOperators() {

      int score = 32;
      
      String passOrFail = (score >= 60) ? "Pass" : "Fail";

      String evenOrOdd = (score % 2 == 0) ? "Even" : "Odd";

      int hours = 13;
      String timeOfDay = (hours < 12) ? (hours + " A.M") : (hours - 12 + " P.M");

      System.out.println(timeOfDay);
    }

    public static void switchStatements() {

        //enhanced switch statement

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the day: ");
        String day = scanner.nextLine();

        /* 
        switch(day) {
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is the weekend");
            case "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");

        }*/

        switch (day) {

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");
        }

    }
}