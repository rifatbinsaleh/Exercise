public abstract class Vehicle {

    public Vehicle()
    {
        System.out.println("Vehicle is Created.");
    }

    public abstract void move();

    public void carry()
    {
        System.out.println("All Vehicle carry loads");
    }

}
