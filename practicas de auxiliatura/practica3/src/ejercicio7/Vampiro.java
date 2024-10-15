package ejercicio7;

public class Vampiro extends Enemigo {
    public Vampiro(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        int daño = super.atacar();
        robarVida(daño / 2);
        return daño;
    }

    private void robarVida(int cantidad) {
        puntosDeVida += cantidad;
        System.out.println(nombre + " ha robado " + cantidad + " puntos de vida.");
    }
}

