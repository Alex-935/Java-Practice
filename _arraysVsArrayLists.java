import java.util.ArrayList;
import java.util.Arrays;

public class _arraysVsArrayLists {
    
    public static void main(String[] args) {
      
        
        //Define array
        String[] friends = new String[5];
        String[] friendsArray2 = {"Leon", "Ada", "Ashley", "Jill", "Chris"};

        //Define arrayList
        ArrayList<String> friendArrayList = new ArrayList<>();
        ArrayList<String> friendArrayList2 = 
                new ArrayList<>(Arrays.asList("Leon", "Ada", "Ashley", "Jill", "Wesker"));

        //Output
        System.out.println(friendsArray2[1]);
        System.out.println(friendArrayList2.get(4));

        //length
        System.out.println(friendsArray2.length);
        System.out.println(friendArrayList2.size());

        //appending times
        //Arrays cannot
        friendArrayList2.add("Chris");

        //set element
        friendsArray2[3] = "Clair";
        friendArrayList2.set(3, "Clair");

        //remove an element
        //cannot do
        friendArrayList2.remove("Chris");

        //printing
        System.out.println(friendsArray2);//outputs [Ljava.lang.String;@7ad041f3
        System.out.println(friendArrayList2);//outputs [Leon, Ada, Ashley, Clair, Wesker]

        
    }
}
