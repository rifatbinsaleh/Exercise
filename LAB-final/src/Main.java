
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2=new Point(1, 2);
        p1.setX(3);
        p1.setY(4);
        p1.setXY(5, 6);

        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.getXY());

    }
}
