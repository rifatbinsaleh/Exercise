import java.util.Scanner;

public class AddNumber {

    public AddNumber(){
        System.out.println("This is constructor");

    }
    public AddNumber(int x,int y){
        int Z=x+y;
        System.out.println(Z);


    }
    public void methode(){
        System.out.println("Rifat");
    }
    public int methode(int s,int t,int m){

        int z=s+t+m;
        return z;
    }
        public static void main(String[] args) {

            Scanner s=new Scanner(System.in);

            int A=s.nextInt();
            int B=s.nextInt();
            int C=s.nextInt();
            AddNumber obj2=new AddNumber(A,B);
            obj2.methode();
            System.out.println(obj2.methode(A,B,C));

        }
    }




