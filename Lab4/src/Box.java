public class Box {

    static int area(int h,int w)
    {
        return h*w;
    }
    static int area(int l,int w,int h)
    {
        return h*w*l;
    }
    public void display(int h, int w, int l) {
        System.out.println("Multiple Height and Width = " + area(h, w));
        System.out.println("Multiple Height,Width and Length= " + area(h, w, l));

    }
    public static void main (String[] args){

        int h=4;
        int w=10;
        int l=2;

        Box obj= new Box();
        obj.display(h,w,l);

    }
}


