package PackageExp7;

class Motorcycle implements Vehicle {
    private int fuelLevel;

    // Constructor
    public Motorcycle(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // Implement start() method
    @Override
    public void start() {
        System.out.println("Motorcycle is starting with self-start...");
    }

    // Implement stop() method
    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    // Implement getFuelLevel() method
    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}