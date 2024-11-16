package ejercicio2;

class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public void aplicarBonificacion(CalculadoraBonificacion calculadora) {
        this.puntos += calculadora.calcular(this.puntos);
    }

    public void mostrarPuntos() {
        System.out.println(nombre + " tiene " + puntos + " puntos.");
    }
}