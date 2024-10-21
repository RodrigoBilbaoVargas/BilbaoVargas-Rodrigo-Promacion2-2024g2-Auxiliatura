package vehicles;

public class GasolineVehicle extends Vehicle {
    private double fuelCapacity;
    private double fuelEfficiency;

    public GasolineVehicle(String brand, String model, double price, double fuelCapacity, double fuelEfficiency) {
        super(brand, model, price);
        this.fuelCapacity = fuelCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
    
    public void displayRange() {
        double range = fuelCapacity * fuelEfficiency;
        System.out.println("Range: " + range + " km");
    }
}