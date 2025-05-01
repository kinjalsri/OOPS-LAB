package PackageExp7;

public abstract class Solid {
    public abstract double calculateVolume();

    public static void main(String[] args) {
        // Creating a Cuboid object (length=5, width=3, height=4)
        Solid cuboid = new Cuboid(5, 3, 4);
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());

        // Creating a Sphere object (radius=2)
        Solid sphere = new Sphere(2);
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
    }

}
