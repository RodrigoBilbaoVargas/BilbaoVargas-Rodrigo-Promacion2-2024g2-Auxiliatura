package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Alice", 100);
        Jugador jugador2 = new Jugador("Bob", 200);

        CalculadoraBonificacion bonificacionPorcentaje = puntosBase -> puntosBase * 20 / 100;
        CalculadoraBonificacion bonificacionFija = puntosBase -> 50;

        jugador1.aplicarBonificacion(bonificacionPorcentaje);
        jugador2.aplicarBonificacion(bonificacionFija);

        jugador1.mostrarPuntos();
        jugador2.mostrarPuntos();
    }
}