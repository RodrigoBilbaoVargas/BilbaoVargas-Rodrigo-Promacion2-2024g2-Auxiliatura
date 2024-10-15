package ejercicio1;

public abstract class Carta {
    protected int valor;
    protected String palo;

    // Constructor para inicializar los atributos
    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Método abstracto jugar()
    public abstract void jugar11();

    // Método para mostrar la carta
    public void mostrarCarta1() {
        System.out.println("Carta: " + valor + " de " + palo);
    }

	protected abstract void mostrarCarta();

	protected abstract void mostrarCarta11();

	protected abstract void jugar();

	protected abstract void jugar1();
}
