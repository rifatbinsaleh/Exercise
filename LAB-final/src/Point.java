

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println("This is constructor");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(x);
        System.out.println(y);
    }

    public void setX(int x) {
        this.x = x;
        System.out.println(x);

    }
    public int getX()
    {
        return x;
    }

    public void setY(int y) {
        this.y = y;
        System.out.println(y);

    }
    public int getY()
    {
        return y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getXY()
    {
        int z;
        return x*y;
    }
}
