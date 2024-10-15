package ejercicio5;

public class Vampiro extends Enemigo {

    public Vampiro(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    // Método atacar, roba la mitad del daño infligido como vida
    @Override
    public int atacar() {
        int daño = super.atacar();
        robarVida(daño / 2);
        return daño;
    }

    // Método para robar vida
    private void robarVida(int cantidad) {
        puntosDeVida += cantidad;
        System.out.println(nombre + " ha robado " + cantidad + " puntos de vida.");
    }
}
