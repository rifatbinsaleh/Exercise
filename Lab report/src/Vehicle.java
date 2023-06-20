public class Vehicle {
    public String brand="Toyota";

}

class Car extends Vehicle {
    public String brand="Tesla";

    public Car(){
        System.out.println("Brand: " +super.brand);
    }
}
