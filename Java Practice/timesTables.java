import java.util.Scanner;

public class timesTables {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int timeTable = scanner.nextInt();

        for (int i = 1; i < 13; i++) {

            System.out.printf("%d x %d = %d\n", i, timeTable, i * timeTable);
        }

    }
}
