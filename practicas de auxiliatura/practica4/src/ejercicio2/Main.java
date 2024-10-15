package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", "Corolla", 180);
        Vehiculo moto = new Moto("Kawasaki", "Ninja", 220);

        coche.mostrarInfo();
        coche.acelerar();

        moto.mostrarInfo();
        moto.acelerar();
        ((Moto) moto).activarTurbo();  // Llamada específica al método de la interfaz Turbo
    }
}
