import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class learning {

    public static void main(String[] args) {
        
        twoDArrays();
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

    public static void operators() {

        //&& AND
        //|| OR, alt + 124
        //! not

        double temp = 40;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is sunny");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good");
        } else if (temp >= 30 || temp <= 0) {
            System.out.println("The weather is bad");
        }

    }

    public static void whileLoops() {

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) { 
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);



        //do while loop. Runs the code once before checking the condition
        int age;

        do {
            System.out.println("Make sure your age is valid");
            System.out.print("Please enter your age: ");
            age = scanner.nextInt();
        } while (age < 0 || age > 125);

        System.out.println("You are " + age + " years old.");

        scanner.close();
    }

    public static void forLoops() {

        for (int i = 0; i < 12 ; i++) {
            
            System.out.println((i + 1) * 12);
        }

        // 3 times table
        for (int i = 3; i < 37 ; i+=3) {
            
            System.out.println(i);
        }
    }

    public static void loopsContinued() {

        //break - breaks out of a loop
        //continue - skip current iteration of a loop

        for (int i = 0; i < 10; i++) {
            
            if (i == 5) {
                continue;
            }

            if (i == 8) {
                break;
            }

            System.out.println(i);
        }
    }

    public static void nestedLoops() {

        //creates a matrix
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j < 10; j++) {
                
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void methods() {

        birthdayMessage("Anakin");

        double num = 3.0;
        double ans = squareNum(num);
        System.out.println(squareNum(num));
    }

    //as happyBirthday is being called from a static method, this needs to also be static
    static void happyBirthday() {

        System.out.println("Happy Birthday to you!");

    }

    static void birthdayMessage(String name) {
        
        happyBirthday();
        happyBirthday();
        System.out.printf("Happy Birthday dear %s!\n", name);
        happyBirthday();
    }

    static double squareNum(double num) {

        return Math.pow(num, 2);
    }



    public static void overloadedMethods() {

        //This is when two methods have the same name but different functionality

        add(2, 7);
        add(2, 7, 6);
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }



    public static void arrays() {

        //can only have values of the same data type, and have a fixed length
        String[] fruits = {"Apple", "Orange", "Banana"};

        int[] numbers = {2, 1, 4, 5};
        //Arrays are formed:   dataType[] _variable_ = {}

        System.out.println(fruits[0]);

        //change value
        fruits[0] = "Cherry";

        //length
        int fruitsLen = fruits.length;

        for (int i = 0; i < fruitsLen; i++) {
            System.out.print(fruits[i] + ", ");
        }
        System.out.println();

        //for fruit in fruits: / enhanced for loops
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //sort
        //needs import java.util.Arrays;
        Arrays.sort(fruits);

        //replaces each item in array with Pineapple
        Arrays.fill(fruits, "Pineapple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        //because you cannot change an array's size, we can define a valueless array of length 3 as so
        //String[] foods = new String[3];

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many food items do you want: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Please enter your food item: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.print(food + " ");
        }

        scanner.close();
    }

    public static void searchArrays() {

        int[] numbers = {2, 5, 7, 9, 13, 45, 7, 4};
        int searchTarget = 4;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (searchTarget == numbers[i]) {
                isFound = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not in array");
        }
        

        //for strings, you have to use if (fruits[i.equals(searchTarget)])#
        //as strings are referential

        String[] fruits = {"Apple", "Orange", "Pineapple"};
        String target = "Pineapple";
        isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (fruits[i].equals(target)) {
                isFound = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not in array");
        }
    }

    public static void variableArguements() {

        /*
         Variable Arguements - allow a method to accept a varying
         # of arguements.
         makes methods more flexible, no need for overloaded methods
         java will pack the arguements into an array
         takes ... (elipses) as parameter
        */

        System.out.println(addVariable(7, 4, 6, 8));
        System.out.println(average(7, 9, 11, 24));
    }

    static int addVariable(int ... numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double ... numbers) {

        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void twoDArrays() {

        //2D Arrays - an array where each element is an array
        String[] fruits = {"apple", "orange", "banana"}; 
        String[] vegetables = {"potato", "carrot", "onion"};
        String[] meat = {"beef", "lamb", "pork", "fish"};
        String[][] groceries = {fruits, vegetables, meat};

        groceries[2][3] = "chicken";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}