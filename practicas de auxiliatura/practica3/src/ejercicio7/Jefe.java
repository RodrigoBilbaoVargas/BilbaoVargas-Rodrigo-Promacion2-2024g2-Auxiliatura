package ejercicio7;

public class Jefe extends Enemigo {
    private double multiplicadorDeDaño;

    public Jefe(String nombre, int puntosDeVida, int dañoBase, double multiplicadorDeDaño) {
        super(nombre, puntosDeVida, dañoBase);
        this.multiplicadorDeDaño = multiplicadorDeDaño;
    }

    public void hablar() {
        System.out.println(nombre + " dice: '¡Prepárate para tu fin, miserable ser!'");
    }

    public int ataqueCritico() {
        int dañoCritico = (int) (dañoBase * multiplicadorDeDaño);
        System.out.println(nombre + " realiza un ataque crítico infligiendo " + dañoCritico + " de daño.");
        return dañoCritico;
    }

    @Override
    public int atacar() {
        System.out.println(nombre + " ataca normalmente.");
        return super.atacar();
    }
}

