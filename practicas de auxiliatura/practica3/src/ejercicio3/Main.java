package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Merlín", 100);
        Arquero arquero = new Arquero("Robin", 80);
        Guerrero guerrero = new Guerrero("Conan", 120);

        mago.mostrarInformacion();
        mago.lanzarHechizo();

        arquero.mostrarInformacion();
        arquero.dispararFlecha();

        guerrero.mostrarInformacion();
        guerrero.atacar();
    }
}
