class Faculty extends LibraryMember {
    private String facultyId;

    public Faculty(String name, String address, String facultyId) {
        super(name, address);
        this.facultyId = facultyId;
        System.out.println("Remove faculty:- Akib");
    }

    public String getFacultyId() {
        return facultyId;
    }

    @Override
    public String getMembershipId() {
        return getFacultyId();
    }
}