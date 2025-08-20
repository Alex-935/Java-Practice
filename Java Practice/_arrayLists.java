import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _arrayLists {

    public static void main(String[] args) {
        
        /*
          ArrayList = A resizable array that stores objects (autoboxing)
                      Arrays are fixed in size, but ArrayLists can change

        */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(5);

        ArrayList<String> fruits = new ArrayList<>();

        String[] myFruits = {"Apple", "Banana", "Cherry"};

        for (String fruit : myFruits) {
            fruits.add(fruit);
        }

        System.out.println(fruits);

        fruits.remove(1);
        fruits.add("Orange");

        //replace fruits[1] with Pineapple
        fruits.set(1, "Pineapple");

        System.out.println(fruits);

        //fruits[2]
        System.out.println(fruits.get(2));

        //length
        System.out.println(fruits.size());

        //order list,  import java.util.Collections; needed
        Collections.sort(fruits);
        System.out.println(fruits);



        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food items you would like: ");
        int itemsNo = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < itemsNo; i++) {
            System.out.print("Please enter your food item: ");
            foods.add(scanner.nextLine());
        }

        System.out.println(foods);
        
        scanner.close();
    }
}