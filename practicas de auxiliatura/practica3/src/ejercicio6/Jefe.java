package ejercicio6;

public class Jefe extends Enemigo {
    private double multiplicadorDeDaño;

    // Constructor de la clase Jefe
    public Jefe(String nombre, int puntosDeVida, int dañoBase, double multiplicadorDeDaño) {
        super(nombre, puntosDeVida, dañoBase);
        this.multiplicadorDeDaño = multiplicadorDeDaño;
    }

    // Método para que el jefe hable antes del combate
    public void hablar() {
        System.out.println(nombre + " dice: '¡Prepárate para tu fin, miserable ser!'");
    }

    // Método de ataque crítico que usa el multiplicador de daño
    public int ataqueCritico() {
        int dañoCritico = (int) (dañoBase * multiplicadorDeDaño);
        System.out.println(nombre + " realiza un ataque crítico infligiendo " + dañoCritico + " de daño.");
        return dañoCritico;
    }

    // Sobreescritura del método atacar de la clase Enemigo
    @Override
    public int atacar() {
        System.out.println(nombre + " ataca normalmente.");
        return super.atacar();
    }
}
