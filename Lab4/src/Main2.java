public class Main2 {
    static int method1(int x)
    {
        System.out.println("Static Methode\t" +x);
        return 0;
    }
    public int method2(int y)
    {
        System.out.println("NON Static Method\t" +y);
        return 0;
    }

    public static void main (String[] args){
        method1(5);
        Main2 obj =new Main2();
        obj.method2(6);



    }







}
