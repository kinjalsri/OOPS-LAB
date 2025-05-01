abstract class Vehicle {
    protected String company;
    protected String model;

    public Vehicle(String make, String model) {
        this.company = make;
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void serviceInfo() {
        System.out.println("Regular servicing is required for optimal performance.");
    }
}

class Car extends Vehicle {
    public Car(String company, String model) {
        super(company, model);
    }

    @Override
    public void startEngine() {
        System.out.println("The engine of " + company + " " + model + " is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("The engine of " + company + " " + model + " is stopping");
    }
}

class Vehicle1
{
    public static void main(String args[])
     {
        Car myCar = new Car("Maruti", "Swift");
        myCar.startEngine();
        myCar.serviceInfo();
        myCar.stopEngine();
    }
}