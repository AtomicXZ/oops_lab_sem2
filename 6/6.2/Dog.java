public class Dog implements NoiseCapable {
    private String name;
    private String animalType;

    public Dog(String name) {
        this.name = name;
        this.animalType = "Dog";
    }

    public void makeNoise() {
        System.out.printf("%s %s barks.%n", animalType, name);
    }
}
