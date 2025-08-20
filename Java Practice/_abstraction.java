public class _abstraction {

    static public void main() {

        /*
          Abstract = Used to define abstract classes and methods
                     Abstraction is the process of hiding implementation details
                     and showing only essential features
                     Abstraction classes CAN'T be instantiated directly
                     Can contain 'abstract' methods (which must be implemented)
                     Can contain 'concrete' methods (which are inherited) 
        */

        //Shape shape = new Shape();
        //because shape is abstract, we cannot create new object this way, adds security to object

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);
        //means users can only create certain types of shapes
        //new shapes can only be created through Shape's children

        circle.display();

        System.out.println(circle.area());
        //System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }

    public abstract static class Shape {

        abstract double area();//abstract method

        void display() {//concrete method, inherited as normal
            System.out.println("This is a shape");
        }

    }

    public static class Circle extends Shape {

        double radius;

        Circle(double radius) {
            this.radius = radius;
        }
        //abstract methods must be overriden in the children
        @Override
        double area() {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    public static class Triangle extends Shape {

        double base;
        double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        double area() {
            return 0.5 * base * height;
        }
    }

    public static class Rectangle extends Shape {

        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

}