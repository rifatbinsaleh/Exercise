class Librarian extends LibraryMember {
    private String employeeId;

    public Librarian(String name, String address, String employeeId) {
        super(name, address);
        this.employeeId = employeeId;
        System.out.println("Employee Name:- "+name);
        System.out.println("Employee Address:- "+address);
        System.out.println("Employee EmployeeId:- "+employeeId);

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void addBook(Book book) {
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        System.out.println("Book removed: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        System.out.println("Faculty added:- " + member.getName());
        System.out.println("Faculty Address:- "+ getAddress());

    }

    public void removeMember(LibraryMember member) {
        System.out.println("Member removed: " + member.getName());
    }

    @Override
    public String getMembershipId() {
        return null;
    }
}