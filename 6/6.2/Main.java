public class Main {
    public static void main(String[] args) {
        NoiseCapable animal1 = new Dog("Mutt");
        NoiseCapable animal2 = new Cat("Stacy");

        animal1.makeNoise();
        animal2.makeNoise();
    }
}
