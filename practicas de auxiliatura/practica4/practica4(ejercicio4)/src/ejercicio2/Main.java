package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", "Corolla", 180);
        coche.mostrarInfo();
        coche.acelerar();

        // Desaceleración del coche
        ((Desacelerable) coche).desacelerar();
    }
}
