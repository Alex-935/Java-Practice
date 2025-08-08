public class _inheritance {
    
    public static void main(String[] args) {

        /*
         Inheritance = One class inherits the attributes and methods
         from another class.
         Child <- Parent <- Grandparent
        */
        
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        cat.eat();

        Plant plant = new Plant();
        plant.photosynthesise();
    }

    public static class Organism {

        boolean isAlive;

        Organism() {
            isAlive = true;
        }

    }

    public static class Animal extends Organism {

        void eat() {
            System.out.println("The animal is eating");
        }
    }

    public static class Dog extends Animal{

        int lives = 1;

        void speak() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal{
        
        int lives = 9;

        void speak() {
            System.out.println("Meow");
        }
    }

    public static class Plant extends Organism{

        void photosynthesise() {
            System.out.println("The plant absorbs sunlight");
        }
    }

}
