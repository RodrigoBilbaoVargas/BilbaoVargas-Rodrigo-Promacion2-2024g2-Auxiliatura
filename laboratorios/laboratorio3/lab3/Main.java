package vehicles;

public class Main {
    public static void main(String[] args) {
        // Electric Vehicle
        ElectricVehicle myEV = new ElectricVehicle("Tesla", "Model 3", 50000, 75, 500);
        myEV.start();
        myEV.displayInfo();
        myEV.displayRange();
        myEV.stop();
        
        // Gasoline Vehicle
        GasolineVehicle myGV = new GasolineVehicle("Ford", "Mustang", 40000, 60, 8);
        myGV.start();
        myGV.displayInfo();
        myGV.displayRange();
        myGV.stop();

        // Hybrid Vehicle
        HybridVehicle myHV = new HybridVehicle("Toyota", "Prius", 35000, 50, 400, 40, 5);
        myHV.start();
        myHV.displayInfo();
        myHV.displayRange();
        myHV.stop();
    }
}