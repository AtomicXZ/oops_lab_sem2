    public class MultilevelInheritanceMain {

        public static void main(String[] args) {

            Person p = new Person("Mary", 25);
            p.display();

            System.out.println();

            Student s = new Student("Sue", 20, 101, 85.5);
            s.display();

            System.out.println();

            GraduateStudent g = new GraduateStudent("Ada", 22, 102, 90.0, "B.Tech", "Computer Science");
            g.display();

            System.out.println();

            // The following will throw error since the fields are set as private
            // System.out.println("Name of person: " + p.name); 
            // System.out.println("Age of person: " + p.age);

            // rollno has default access and can be accessed since the class is in same package
            System.out.println("Roll number of student: " + s.rollNo);
            // marks has protected access and can be accessed from same package classes
            System.out.println("Marks of student: " + s.marks);

            // The following have public access and can be accessed anywhere
            System.out.println("Degree of graduate student: " + g.degree);
            System.out.println("Specialization of graduate student: " + g.specialization);

            // the marks method calls a superclass field which has protected access
            g.marks();
        }
    }