package ejercicio7;

public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosDeVida;
    protected Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.inventario = new Inventario();
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de vida: " + puntosDeVida);
    }

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    public void curar() {
        puntosDeVida += 20;
        System.out.println(nombre + " ha sido curado y ahora tiene " + puntosDeVida + " puntos de vida.");
    }
}

