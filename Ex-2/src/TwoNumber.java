import java.util.Scanner;
public class TwoNumber {
    int x,y,sum;

    public void add(){
        Scanner input=new Scanner(System.in);
        System.out.println("Input two Number");
        x=input.nextInt();
        y=input.nextInt();
        sum=x+y;
        System.out.println("Sum is="+sum);
    }


    public static void main(String[] args) {
        TwoNumber obj=new TwoNumber();
                obj.add();
    }
}
