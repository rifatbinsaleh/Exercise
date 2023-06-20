class Student extends LibraryMember {
    private String studentId;

    public Student(String name, String address, String studentId) {
        super(name, address);
        this.studentId = studentId;
        System.out.println("Student Name:- "+name);
        System.out.println("Student Address:- "+address);
        System.out.println("Student ID:- "+studentId);
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String getMembershipId() {
        return getStudentId();
    }
}
