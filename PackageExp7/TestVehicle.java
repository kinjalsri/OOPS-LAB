package PackageExp7;

public class TestVehicle {
    public static void main(String[] args) {

        Vehicle myCar = new Car(75);
        System.out.println("Car Details:");
        myCar.start();
        System.out.println("Fuel Level: " + myCar.getFuelLevel() + "%");
        myCar.stop();

        System.out.println("------------------------------");

        Vehicle myMotorcycle = new Motorcycle(50);
        System.out.println("Motorcycle Details:");
        myMotorcycle.start();
        System.out.println("Fuel Level: " + myMotorcycle.getFuelLevel() + "%");
        myMotorcycle.stop();
    }
}
