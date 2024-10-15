package ejercicio2;

public class Coche extends Vehiculo implements Desacelerable {

    public Coche(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
    }

    // Implementación de desacelerar()
    @Override
    public void desacelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está desacelerando.");
    }
}
