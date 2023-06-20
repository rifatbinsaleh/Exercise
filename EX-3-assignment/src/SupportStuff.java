public class SupportStuff extends Employee{
    private String jobTitle;
    public Professor(int employeeID, String name, double salary,String jobTitle) {
        super(employeeID, name, salary);
        this.jobTitle=jobTitle;

    public String getJobTitle(){

        return jobTitle;
    }
    public String toString(){

        return employeeID,name,salary;
    }

}
