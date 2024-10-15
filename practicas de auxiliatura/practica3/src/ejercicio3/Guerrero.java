package ejercicio3;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int fuerza) {
        super(nombre);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void atacar() {
        System.out.println(getNombre() + " ha realizado un ataque.");
    }
}
