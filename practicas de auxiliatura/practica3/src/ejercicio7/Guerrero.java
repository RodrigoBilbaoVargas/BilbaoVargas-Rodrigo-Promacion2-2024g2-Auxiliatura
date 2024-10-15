package ejercicio7;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosDeVida, int fuerza) {
        super(nombre, nivel, puntosDeVida);
        this.setFuerza(fuerza);
    }

    public void atacar() {
        System.out.println(nombre + " realiza un ataque con fuerza.");
    }

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
}

