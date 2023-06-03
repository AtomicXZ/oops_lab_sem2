class Student extends Person {

    int rollNo;
    protected double marks;

    public Student(String name, int age, int rollNo, double marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}