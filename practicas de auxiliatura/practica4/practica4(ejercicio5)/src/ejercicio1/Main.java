package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Carta cartaEspecial = new CartaEspecial(10, "Picas");
        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();

        // Reversión del efecto de la carta especial
        ((Reversible) cartaEspecial).revertir();
    }
}
