package ejercicio3;

public class Vaca extends Animal implements Productor {

    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " (la vaca) dice: ¡Muuu!");
    }

    @Override
    public void producir() {
        System.out.println(nombre + " está produciendo leche.");
    }
}
