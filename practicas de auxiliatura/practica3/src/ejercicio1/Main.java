package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Guerrero", 10, 100);

        personaje.mostrarEstado(); // Muestra el estado inicial

        personaje.recibirDaño(20); // Recibe 20 puntos de daño

        personaje.mostrarEstado(); // Muestra el estado después del daño

        personaje.curar(); // Cura al personaje

        personaje.mostrarEstado(); // Muestra el estado después de la cura
    }
}