package ejercicio3;

public class Vaca extends Animal implements Productor {

    // Constructor
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " (la vaca) dice: ¡Muuu!");
    }

    // Implementación de la interfaz Productor
    @Override
    public void producir() {
        System.out.println(nombre + " está produciendo leche.");
    }
}
