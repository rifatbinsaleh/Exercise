public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean Acmachine;

    public Room() {
        System.out.println("Hello, an object of Room class is created.");
    }

    public Room(int no, String type, float area, boolean Ac) {
        roomno = no;
        roomtype = type;
        roomarea = area;
        Acmachine = Ac;
    }

    public void displayData() {
        System.out.println(roomno);
        System.out.println(roomtype);
        System.out.println(roomarea);
        System.out.println(Acmachine);
    }
    public static void main(String[] args) {
        Room obj = new Room(218,"CSE",202.5f,true);
        Room obj1=new Room();
        obj.displayData();
    }
}
