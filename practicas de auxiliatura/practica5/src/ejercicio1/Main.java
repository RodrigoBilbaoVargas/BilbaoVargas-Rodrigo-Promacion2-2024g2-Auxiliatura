package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Batalla Final");
        Evento evento2 = new Evento("Recompensa Encontrada");

        evento1.registrarNotificacion(mensaje -> System.out.println(mensaje));
        evento2.registrarNotificacion(mensaje -> System.out.println(mensaje));

        evento1.activar();
        evento2.activar();
    }
}