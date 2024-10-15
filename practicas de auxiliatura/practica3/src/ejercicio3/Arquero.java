package ejercicio3;

public class Arquero extends Personaje {
    private int destreza;

    public Arquero(String nombre, int destreza) {
        super(nombre);
        this.destreza = destreza;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void dispararFlecha() {
        System.out.println(getNombre() + " ha disparado una flecha.");
    }
}
