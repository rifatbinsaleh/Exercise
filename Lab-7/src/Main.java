import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();

        Vehical vi=new Vehical();
        vi.run();

        Bike bi=new Bike();
        bi.speed=a;
        bi.run();

        Car ca=new Car();
        ca.speed=b;
        ca.run();


    }
}