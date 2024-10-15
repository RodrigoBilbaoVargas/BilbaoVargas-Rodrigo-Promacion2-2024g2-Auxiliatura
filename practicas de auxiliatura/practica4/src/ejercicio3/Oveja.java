package ejercicio3;

public class Oveja extends Animal implements Productor {

    // Constructor
    public Oveja(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " (la oveja) dice: ¡Beee!");
    }

    // Implementación de la interfaz Productor
    @Override
    public void producir() {
        System.out.println(nombre + " está produciendo lana.");
    }
}
