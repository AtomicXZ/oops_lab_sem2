public class Cat implements NoiseCapable {
    private String name;
    private String animalType;

    public Cat(String name) {
        this.name = name;
        this.animalType = "Cat";
    }

    public void makeNoise() {
        System.out.printf("%s %s purrs.%n", animalType, name);
    }
}
