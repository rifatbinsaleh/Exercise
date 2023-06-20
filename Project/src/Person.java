
// Class demonstrating OOP concepts
public class Person {
    private String name;
    private int age;

    public Person(){
        System.out.println("This is constructor");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void mehtode1(){
        System.out.println("This mathode hase no perameter.");
    }
    public void mehtode1(int date){
        int x=date;
        System.out.println("Birthday date"+x);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
