
public class Doctor {
    private String name;
    private int id;
    private String hospitalName;
    private String phoneNo;

    public Doctor(){
        System.out.println("Doctor Information----");
    }

    public void getData(String name,int id,String hospitalName,String phoneNo){
        this.name=name;
        this.id=id;
        this.hospitalName=hospitalName;
        this.phoneNo=phoneNo;

    }

    public String getName(){

        return name;

    }

    public int getId(){

        return id;
    }

    public void display(){

        System.out.println("NAME="+getName());
        System.out.println("ID="+getId());
        System.out.println("Hospital Name="+hospitalName);
        System.out.println("Phone No="+phoneNo);

    }

    public static void main(String[] args) {
        Doctor d=new Doctor();
        d.getData("Rifat",221,"Dhaka Hospital", "1627274");
        d.display();
        System.out.println(+id + +name);
    }

}
