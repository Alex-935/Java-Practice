public class _super {
    
    public static void main(String[] args) {

        //super = refers to the parent class (subclass <- superclass)
        //        used in constructors and method overriding
        //        calls the parent constructor to initialise attributes

        Person person = new Person("Obi-Wan", "Kenobi");
        Student student = new Student("Anakin", "Skywalker", 3.5);
        Employee employee = new Employee("Battle", "Droid", 12.50);
        

    }

    public static class Person {
        
        String first;
        String last;

        Person(String first, String last) {

            this.first = first;
            this.last = last;

        }

        void showName() {
            System.out.println(this.first + " " + this.last);
        }
    }

    public static class Student extends Person {


        double gpa;

        Student(String first, String last, double gpa) {

            super(first, last);
            this.gpa = gpa;
        }

        void showGpa() {
            System.out.println(this.first + "'s GPA is " + this.gpa);
        }
    }

    public static class Employee extends Person{

        double salary;

        Employee(String first, String last, double salary) {

            super(first, last);
            this.salary = salary;
        }

        void showSalary() {
            System.out.println(this.first + "'s salary is " + this.salary);
        }
    }
}
