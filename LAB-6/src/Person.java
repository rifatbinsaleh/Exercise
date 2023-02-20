public class Person {
    private  String Name;
    private  int ID;

    Person(String Name, int ID) {
        this.Name = Name;
        this.ID = ID;
    }

    public void setName(String Name){
        this.Name=Name;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }
    public static void main(String[] arg){
        Person a1 = new Person("Rifat" ,4846);
        System.out.println(a1.getName());
        System.out.println(a1.getID());
        a1.setName("Aywon");
        a1.setID(221);
        System.out.println(a1.getName());
        System.out.println(a1.getID());
    }
}
