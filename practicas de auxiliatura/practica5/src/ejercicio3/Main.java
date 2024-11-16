package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Aventura aventura = new Aventura();

        aventura.agregarTarea(() -> System.out.println("Explorando la cueva..."));
        aventura.agregarTarea(() -> System.out.println("Rescatando al aldeano..."));
        aventura.agregarTarea(() -> System.out.println("Recogiendo tesoro..."));

        aventura.iniciar();
    }
}