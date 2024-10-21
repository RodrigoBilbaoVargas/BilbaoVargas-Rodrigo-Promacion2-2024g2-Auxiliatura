package vehicles;

public class HybridVehicle extends ElectricVehicle {
    private double fuelCapacity;
    private double fuelEfficiency;

    public HybridVehicle(String brand, String model, double price, double batteryCapacity, int electricRange, double fuelCapacity, double fuelEfficiency) {
        super(brand, model, price, batteryCapacity, electricRange);
        this.fuelCapacity = fuelCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
    }

    @Override
    public void displayRange() {
        super.displayRange();
        double totalRange = (fuelCapacity * fuelEfficiency) + super.range;
        System.out.println("Total Range (Electric + Gasoline): " + totalRange + " km");
    }
}