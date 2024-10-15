package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Aventurero");

        // Agregar items al inventario
        personaje.inventario.agregarItem("Espada");
        personaje.inventario.agregarItem("Escudo");
        personaje.inventario.agregarItem("Poción de salud");

        // Mostrar el inventario
        personaje.mostrarInventario();
    }
}