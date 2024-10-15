package ejercicio3;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int mana) {
        super(nombre);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void lanzarHechizo() {
        System.out.println(getNombre() + " ha lanzado un hechizo.");
    }
}
