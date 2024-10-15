package ejercicio7;

public class Arquero extends Personaje {
    private int destreza;

    public Arquero(String nombre, int nivel, int puntosDeVida, int destreza) {
        super(nombre, nivel, puntosDeVida);
        this.setDestreza(destreza);
    }

    public void dispararFlecha() {
        System.out.println(nombre + " dispara una flecha.");
    }

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
}
