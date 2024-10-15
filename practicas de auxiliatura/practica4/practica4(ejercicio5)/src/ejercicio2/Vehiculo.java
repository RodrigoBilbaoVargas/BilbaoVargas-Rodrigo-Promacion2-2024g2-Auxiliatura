package ejercicio2;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    // Constructor para inicializar los atributos
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método abstracto acelerar()
    public abstract void acelerar();

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + " con velocidad máxima de " + velocidadMaxima + " km/h");
    }
}
