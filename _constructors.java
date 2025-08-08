public class _constructors {
    
    public static void main(String[] args) {
        
        /*
         Constructor - A special method to initialise objects
                       You can pass arguements to a constructor
                       and set up initial values
        */

        Student student1 = new Student("Spngebob", 30, 3.2);
        Student student2 = new Student("Patrick", 32, 1.5);

        student1.study();


        /*Overloaded constructors = Allows a class  to have multiple constructors
        with different parameter lists
        Enable objects to be initialised in various ways.
        */

        User user1 = new User();
        User user2 = new User("Anakin", "deathStickEnjoyer@podracing.com", 19);
    }

    public static class Student {

        String name;
        int age;
        double gpa;
        boolean isEnrolled;

        //constructor uses same name as class
        Student(String name, int age, double gpa) {

            this.name = name;
            this.age = age;
            this.gpa = gpa;
            this.isEnrolled = true;
        }

        void study() {
            System.out.println(this.name + " is studying.");
        }
    }


    public static class User {

        String username;
        String email;
        int age;

        User() {

            this.username = "Guest";
            this.email = "Not Provided";
            this.age = 0;
        }

        User(String username) {

            this.username = username;
            this.email = "Not Provided";
            this.age = 0;
        }

        User(String username, String email) {

            this.username = username;
            this.email = email;
            this.age = 0;
        }

        User(String username, String email, int age) {

            this.username = username;
            this.email = email;
            this.age = age;
        }
    }


}
