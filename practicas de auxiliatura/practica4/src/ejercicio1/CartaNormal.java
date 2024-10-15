package ejercicio1;

public class CartaNormal extends Carta {

    // Constructor
    public CartaNormal(int valor, String palo) {
        super(valor, palo);
    }

    // Implementación del método jugar()
    public void jugar() {
        System.out.println("La carta normal " + valor + " de " + palo + " ha sido jugada.");
    }

	@Override
	protected void mostrarCarta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar11() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void mostrarCarta11() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void jugar1() {
		// TODO Auto-generated method stub
		
	}
}
