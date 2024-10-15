package ejercicio1;

public class Main {
	    public static void main(String[] args) {
	        Carta cartaNormal = new CartaNormal(5, "Corazones");
	        Carta cartaEspecial = new CartaEspecial(10, "Picas");

	        cartaNormal.mostrarCarta();
	        cartaNormal.jugar();

	        cartaEspecial.mostrarCarta1();
	        cartaEspecial.jugar();
	    }
	}
