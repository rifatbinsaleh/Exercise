public class Administraror extends Employee {

    private String department;

    public Administraror(int employeeID, String name, double salary,String department) {
        super(employeeID, name, salary);
        this.department=department;
    }

    public String getDepartment(){

        return department;
    }

    public String toString(){

        return employeeID,name,salary;
    }

}
