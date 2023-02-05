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
        System.out.println("Multiple two value = " + area(h, w));
        System.out.println("Multiple three value = " + area(h, w, l));

    }
    public static void main (String[] args){

        int h=6;
        int w=7;
        int l=9;


        Box obj= new Box();

        obj.display(h,w,l);

    }
}


