public class AddMain {

    public static void main(String[] args) {
        Add adder = new Add();

        System.out.println("Adding two doubles: " + adder.add(10.5, 5.5));

        System.out.println("Adding two strings: " + adder.add("Hello", "World"));

        System.out.println("Adding two booleans: " + adder.add(false, false));
    }
}