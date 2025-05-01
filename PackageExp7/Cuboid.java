package PackageExp7;

public class Cuboid extends Solid {

    private double length, width, height;

    // Constructor
    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Override calculateVolume() to compute cuboid volume
    @Override

    public double calculateVolume() {
        return length * width * height;
    }

}
