package ejercicio5;

public class Enemigo {
    protected String nombre;
    protected int puntosDeVida;
    protected int dañoBase;

    public Enemigo(String nombre, int puntosDeVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.dañoBase = dañoBase;
    }

    // Método para atacar, devuelve el daño base
    public int atacar() {
        return dañoBase;
    }

    // Método para recibir daño y reducir los puntos de vida
    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    // Método para verificar si el enemigo sigue vivo
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    // Método para mostrar el estado del enemigo
    public void mostrarEstado() {
        System.out.println(nombre + " tiene " + puntosDeVida + " puntos de vida.");
    }
}
