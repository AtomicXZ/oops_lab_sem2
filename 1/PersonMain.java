// 22BCE7776
class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName) {
        this(firstName, "", 0);
    }

    Person(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    Person(String firstName, int age) {
        this(firstName, "", age);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s\nLast Name: %s\nAge: %s",
                firstName,
                lastName.isEmpty() ? "[Not Given]" : lastName,
                age);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Rohan");
        Person p2 = new Person("Chris", 16);
        Person p3 = new Person("Jane", "Doe");
        Person p4 = new Person("Mary", "Sue", 20);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}