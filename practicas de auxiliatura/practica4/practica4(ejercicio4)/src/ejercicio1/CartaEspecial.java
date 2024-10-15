package ejercicio1;

public class CartaEspecial extends Carta implements Accionable, Reversible {

    public CartaEspecial(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("La carta especial " + valor + " de " + palo + " ha sido jugada.");
        realizarAccion();
    }

    @Override
    public void realizarAccion() {
        System.out.println("Se ha realizado la acción especial de la carta.");
    }

    // Implementación de revertir()
    @Override
    public void revertir() {
        System.out.println("El efecto de la carta especial " + valor + " de " + palo + " ha sido revertido.");
    }

	@Override
	public void jugar11() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void mostrarCarta() {
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
