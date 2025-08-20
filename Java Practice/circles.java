import java.util.Scanner;

public class circles {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double pi = Math.PI;

        System.out.print("Pleace enter the radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * radius * pi;
        double area = pi * Math.pow(radius, 2);
        double volume = (4.0/3.0) * pi * Math.pow(radius, 3);

        System.out.printf("The circumference of the cricle is: %.2fcm.", circumference);
        System.out.printf("\nThe area of the circle is: %.2fcm².", area);
        System.out.printf("\nThe volume of the sphere is: %.2fcm³.", volume);

        scanner.close();

    }
}
