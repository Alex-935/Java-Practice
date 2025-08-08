public class _wrapper {
    
    public static void main() {

        /*
          Wrapper classes = Allows primitive values (int, char, double, boolean)
                            to be used as objects. "Wrap them in an object"
                            Generally, don't wrap primitives unless you need an object.
                            Allows use of Collections Framework and static Utility Methods.
        */

        //depreciated technique but visual
        // Integer a = new Integer(123);
        //Double b = new Double(3.14);
        //Character c = new Character('$');
        //Boolean d = new Boolean(true);

        //Autoboxing - uses a wrapper class to convert to object
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        //Unboxing - taking a primitive wrapped in an object and unwrapping it
        int x = a;
        double y = b;
        char z = c;
        boolean w = d;


        // wrapper utilities

        //primitive data type to string
        String s = Integer.toString(123);
        String t = Double.toString(3.14);
        String u = Character.toString('@');
        String v = Boolean.toString(true);

        //string into primitive data type
        int e = Integer.parseInt("123");
        double f = Double.parseDouble("3.14");
        char g = "Pizza".charAt(0);
        boolean h = Boolean.parseBoolean("true");

        //checks if a character is a letter
        char letter = 'b';
        System.out.println(Character.isLetter('b'));
        System.out.println(Character.isLetter('#'));

        //checks if upper case
        System.out.println(Character.isUpperCase('b'));
        System.out.println(Character.isUpperCase('B'));
    }
}
