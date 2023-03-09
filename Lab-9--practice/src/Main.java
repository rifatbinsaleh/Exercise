public class Main {
    public static void main(String[] args) {
        AddressInfo addressInfo= new AddressInfo("Sector 4", "Uttara", "Dhaka", "1711");
        InsuranceInfo insuranceInfo =new InsuranceInfo("Life Insurance", 123);
        Employeee employeee =new Employeee("Mr. Rahim",addressInfo, insuranceInfo );
        employeee.display();
    }
}