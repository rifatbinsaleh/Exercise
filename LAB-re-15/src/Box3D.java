public class Box3D extends Box {
    public Box3D(double length, double breadth, double height) {
        super(height, breadth, length);
    }
    public double area()
    {
        return height*length;
    }
    public double volume()
    {
        return height*length*breadth;
    }
}
