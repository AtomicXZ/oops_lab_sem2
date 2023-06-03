//22BCE7776
class Box {
    private double length;
    private double breadth;
    private double height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(double side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

public class BoxMain {
    public static void main(String[] args) {
        Box cuboid = new Box(10, 5, 7);

        System.out.println("The length of the box is "
                + cuboid.getLength());

        cuboid.setLength(12);
        System.out.println("After changing, the length of the box is "
                + cuboid.getLength());

        System.out.printf("Dimensions of the box:%nLength: %.2f%nBreadth: %.2f%nHeight: %.2f%n",
                cuboid.getLength(), cuboid.getBreadth(), cuboid.getHeight());
    }
}
