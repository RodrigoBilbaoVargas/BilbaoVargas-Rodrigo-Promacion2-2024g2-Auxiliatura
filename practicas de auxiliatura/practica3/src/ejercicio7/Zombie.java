package ejercicio7;

public class Zombie extends Enemigo {
    public Zombie(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        regenerarVida();
        return super.atacar();
    }

    private void regenerarVida() {
        puntosDeVida += 5;
        System.out.println(nombre + " ha regenerado 5 puntos de vida.");
    }
}
