import java.util.Scanner;

public class _runtimePolymorphism {

    public static void main(String[] args) {

        // Runtime Polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of object


        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 or 2): ");
        int ans = scanner.nextInt();

        //runtime polymorphism as the object's type is decided during runtime
        // and the method is dependent on which type of object is created
        if (ans == 1) {
            animal = new Dog();
            animal.speak();
        } else {
            animal = new Cat();
            animal.speak();
        }
    }

    public abstract static class Animal {

        abstract void speak();
    }

    public static class Dog extends Animal {

        @Override
        void speak() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal {

        @Override
        void speak() {
            System.out.println("Meow");
        }
    }
}