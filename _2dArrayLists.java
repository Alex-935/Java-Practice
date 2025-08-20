import java.util.ArrayList;
import java.util.Arrays;

public class _2dArrayLists {

    public static void main(String[] args) {
        
        ArrayList<String> bakeryList = new ArrayList<>(Arrays.asList("Bread", "Garlic Bread", "Doughnuts"));
        ArrayList<String> produceList = new ArrayList<>(Arrays.asList("Tomataes", "Pepper", "Onion"));
        ArrayList<String> drinkList = new ArrayList<>(Arrays.asList("Water", "Coffee"));

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>(Arrays.asList(bakeryList, produceList, drinkList));

        System.out.println(groceryList);
        //get innner list
        System.out.println(groceryList.get(1));
        //gets individual item
        System.out.println(groceryList.get(1).get(0));
    }
}