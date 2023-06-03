public class Innova extends Car{
    private int weight;

    public Innova(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        return (weight > 2000 ? 0.9 : 0.8) * super.getSalePrice();
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Weight: " + this.weight;
    }
}
