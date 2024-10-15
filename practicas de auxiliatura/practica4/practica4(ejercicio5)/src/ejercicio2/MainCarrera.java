package ejercicio2;

public class MainCarrera {
    public static void main(String[] args) {
        // Prueba con Coche
        Vehiculo coche = new Coche("Toyota", "Corolla", 180);
        coche.mostrarInfo();
        coche.acelerar();

        // Prueba de desaceleración
        ((Desacelerable) coche).desacelerar();

        // Prueba con Moto
        Vehiculo moto = new Moto("Kawasaki", "Ninja", 220);
        moto.mostrarInfo();
        moto.acelerar();

        // Prueba de activación de turbo en la moto
        ((Turbo) moto).activarTurbo();
    }
}
