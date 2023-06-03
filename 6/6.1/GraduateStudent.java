class GraduateStudent extends Student {

    public String degree;
    public String specialization;

    public GraduateStudent(String name, int age, int rollNo, double marks, String degree, String specialization) {
        super(name, age, rollNo, marks);
        this.degree = degree;
        this.specialization = specialization;
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("Degree: " + degree);
        System.out.println("Specialization: " + specialization);
    }

    protected void marks() {
        // marks can be accessed since it has protected access modifier and this is the child class
        System.out.println("Marks of graduate student: " + super.marks);
    }
}