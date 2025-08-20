public class _anonymousClasses {
    
    public static void main(String[] args) {
        
        //anonymous classes = a class that doesn't have a name, cannot be reused.
                            //add custom behaviour without having to create a new class
                            //often used for one time uses (TimerTask, Runnable, Callbacks)
           
        Dog dog = new Dog();
        dog.speak();

        /*
        TalkingDog scooby_doo = new TalkingDog();
        scooby_doo.speak(); */
        //instead of creating a new class for one exception, we can create an anonymous class

        Dog scooby_Doo = new Dog() {

            @Override
            void speak() {
                System.out.println("Do you have any scooby snacks?");
            }
        };

        scooby_Doo.speak();
    }

    public static class Dog {

        void speak() {
            System.out.println("Woof");
        }
    }

    /* 
    public static class TalkingDog extends Dog{

        @Override
        void speak() {
            System.out.println("Do you have any scooby snacks?");
        }
    }
    */
}
