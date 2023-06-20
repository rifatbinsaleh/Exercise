public class Main {
    public static void main (String[]args) {
        Professor professor1 = new Professor(9011, "MD Muhasin Ali",
                50200.00, "CSE");
        Administrator administrator1 = new Administrator(4739, "Akash",
                25000.00, "Admin");
        SupportStaff supportStaff1 = new SupportStaff(1122, "Siyam",
                55000.00, "It Officer");
        System.out.println(professor1);
        System.out.println(administrator1);
        System.out.println(supportStaff1);
        Employee[] employees = {professor1, administrator1, supportStaff1};
        double totalSalary = Employee.totalSalary(employees);
        System.out.println("Total Salary of all employees:" + totalSalary + "
                Taka. ");
    }
}