package ejercicio1;


public class CartaEspecial extends Carta implements Accionable {

    // Constructor
    public CartaEspecial(int valor, String palo) {
        super(valor, palo);
    }

    // Implementación del método jugar()
    public void jugar() {
        System.out.println("La carta especial " + valor + " de " + palo + " ha sido jugada.");
        realizarAccion();  // Realiza una acción especial después de jugar
    }

    // Implementación de la interfaz Accionable
    @Override
    public void realizarAccion() {
        System.out.println("Se ha realizado la acción especial de la carta.");
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
