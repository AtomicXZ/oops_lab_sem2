public class Main {
    public static void main(String[] args) {
        Car car = new Car(100, 25000, "peach");
        Car ford = new Ford(100, 25000, "pink", 2004, 10000);
        System.out.println("Car:\n" + car);
        System.out.println("\nFord:\n" + ford);
    }
}
