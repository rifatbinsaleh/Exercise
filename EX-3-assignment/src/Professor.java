public class Professor extends Employee {
    private String subjectofExperDse;

    public Professor(int employeeID, String name, double salary,String subjectofExperDse) {
        super(employeeID, name, salary);
        this.subjectofExperDse=subjectofExperDse;
    }

    public String getSubjectofExperDse(){

        return subjectofExperDse;
    }
    public String toString(){

        return employeeID,name,salary;
    }
}
