package PackageExp7;

public class Car implements Vehicle {
    private int fuelLevel;

    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // Implement start() method
    @Override
    public void start() {
        System.out.println("Car is starting with ignition key...");
    }

    // Implement stop() method
    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    // Implement getFuelLevel() method
    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

}
