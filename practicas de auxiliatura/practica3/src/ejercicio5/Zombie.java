package ejercicio5;

public class Zombie extends Enemigo {

    public Zombie(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    // Método atacar, además regenera 5 puntos de vida cada vez que ataca
    @Override
    public int atacar() {
        regenerarVida();
        return super.atacar();
    }

    // Regenera 5 puntos de vida
    private void regenerarVida() {
        puntosDeVida += 5;
        System.out.println(nombre + " ha regenerado 5 puntos de vida.");
    }
}
