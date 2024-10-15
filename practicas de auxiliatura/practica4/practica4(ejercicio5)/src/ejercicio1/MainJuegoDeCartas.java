package ejercicio1;

public class MainJuegoDeCartas {
    public static void main(String[] args) {
        // Prueba con Carta Normal
        Carta cartaNormal = new CartaNormal(5, "Corazones");
        cartaNormal.mostrarCarta();
        cartaNormal.jugar();

        // Prueba con Carta Especial
        Carta cartaEspecial = new CartaEspecial(10, "Picas");
        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();

        // Prueba de la acción especial
        ((Accionable) cartaEspecial).realizarAccion();

        // Prueba de la reversión del efecto
        ((Reversible) cartaEspecial).revertir();
    }
}
