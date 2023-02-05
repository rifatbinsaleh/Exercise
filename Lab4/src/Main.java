public class Main {
    static void method1()
    {
        System.out.println("Static Methode");
    }
    public void method2()
    {
        System.out.println("NON String Method ");
    }

    public static void main (String[] args){
        method1();
        Main obj =new Main();
        obj.method2();



    }







}
