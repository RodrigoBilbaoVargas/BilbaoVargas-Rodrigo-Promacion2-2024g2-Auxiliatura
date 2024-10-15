package ejercicio7;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel, int puntosDeVida, int mana) {
        super(nombre, nivel, puntosDeVida);
        this.mana = mana;
    }

    public void lanzarHechizo() {
        if (mana >= 10) {
            System.out.println(nombre + " lanza un hechizo mágico.");
            mana -= 10;
        } else {
            System.out.println(nombre + " no tiene suficiente mana para lanzar un hechizo.");
        }
    }
}
