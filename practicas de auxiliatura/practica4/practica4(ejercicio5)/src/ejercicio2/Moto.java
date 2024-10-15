package ejercicio2;

public class Moto extends Vehiculo implements Turbo {

    // Constructor
    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    // Implementación del método acelerar()
    @Override
    public void acelerar() {
        System.out.println("La moto " + marca + " " + modelo + " está acelerando.");
    }

    // Implementación de la interfaz Turbo
    @Override
    public void activarTurbo() {
        System.out.println("La moto " + marca + " " + modelo + " ha activado el turbo.");
    }
}
