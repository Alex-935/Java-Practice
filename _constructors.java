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
    }

    public static class Student {

        String name;
        int age;
        double gpa;
        boolean isEnrolled;

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


}
