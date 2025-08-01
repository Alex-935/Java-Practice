
public class learning {

    public static void main(String[] args) {
        
        arithmetic();
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
}