public class Ford extends Car{
    private int year;
    private int discount;

    public Ford(int speed, double regularPrice, String color, int year, int discount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.discount = discount;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice() - this.discount;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Year: " + this.year;
    }
}
