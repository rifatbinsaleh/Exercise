public class Main {
    public static void main(String[] args) {
        // Creating and using objects
        Person p1=new Person();
        p1.mehtode1();
        Person p2 = new Person("John Doe", 30);
        p2.displayInfo();
        p2.mehtode1();
        System.out.println();

        Student s = new Car();
        s.demo();
        System.out.println();

        // Demonstrating interface implementation
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println();

        // Calling other examples
        ArrayExample.main(args);
        System.out.println();
        InputOutputExample.main(args);
        System.out.println();
        ExceptionHandlingExample.main(args);
        System.out.println();
        FileHandlingExample.main(args);
    }
}
