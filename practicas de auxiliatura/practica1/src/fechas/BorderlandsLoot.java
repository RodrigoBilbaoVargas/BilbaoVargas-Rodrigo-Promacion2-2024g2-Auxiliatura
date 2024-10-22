package fechas;

import java.util.*;

public class BorderlandsLoot {

    // Constantes para los atributos de botín
    private static final int MIN_DAÑO = 1;
    private static final int MAX_DAÑO = 10;
    private static final int MIN_CADENCIA = 1;
    private static final int MAX_CADENCIA = 5;
    private static final int MIN_CARGADOR = 1;
    private static final int MAX_CARGADOR = 20;
    private static final int MIN_CAPACIDAD = 1;
    private static final int MAX_CAPACIDAD = 50;
    private static final int MIN_RECARGA = 1;
    private static final int MAX_RECARGA = 10;
    private static final int MIN_RESISTENCIA = 1;
    private static final int MAX_RESISTENCIA = 3;
    private static final int MIN_BONIFICACION = 1;
    private static final int MAX_BONIFICACION = 20;
    private static final int MIN_DURACION = 1;
    private static final int MAX_DURACION = 10;

    public enum TipoBotin {
        ARMA, ESCUDO, MODIFICADOR
    }

    public enum Rareza {
        COMUN, POCO_COMUN, RARO, EPICO, LEGENDARIO
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Map<String, Object>> historialBotin = new ArrayList<>();

        // Bucle principal del juego
        while (true) {
            // Simula la lucha contra un enemigo y la posibilidad de obtener botín
            Map<String, Object> botin = generarBotin(random);
            historialBotin.add(botin);  // Guardamos el botín en el historial

            // Muestra la información del botín al jugador
            System.out.println("¡Has encontrado un botín! \n" + obtenerDescripcionBotin(botin));

            // Pregunta al jugador si desea continuar
            String respuesta;
            do {
                System.out.print("¿Quieres seguir luchando? (s/n): ");
                respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Por favor ingresa una opción válida (s/n).");
                }
            } while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));

            if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("¡Gracias por jugar!");
                mostrarResumenBotin(historialBotin);  // Muestra el resumen de todo el botín obtenido
                break;
            }
        }
        scanner.close();
    }

    // Genera un botín aleatorio
    public static Map<String, Object> generarBotin(Random random) {
        Map<String, Object> botin = new HashMap<>();
        TipoBotin[] tipos = TipoBotin.values();
        Rareza[] rarezas = Rareza.values();

        // Genera el tipo, rareza y atributos del botín
        botin.put("tipo", tipos[random.nextInt(tipos.length)]);
        botin.put("rareza", rarezas[random.nextInt(rarezas.length)]);

        // Genera atributos específicos según el tipo de botín
        switch ((TipoBotin) botin.get("tipo")) {
            case ARMA:
                botin.put("atributo_1", "Daño: " + (random.nextInt(MAX_DAÑO - MIN_DAÑO + 1) + MIN_DAÑO));
                botin.put("atributo_2", "Cadencia de fuego: " + (random.nextInt(MAX_CADENCIA - MIN_CADENCIA + 1) + MIN_CADENCIA));
                botin.put("atributo_3", "Capacidad del cargador: " + (random.nextInt(MAX_CARGADOR - MIN_CARGADOR + 1) + MIN_CARGADOR));
                break;
            case ESCUDO:
                botin.put("atributo_1", "Capacidad: " + (random.nextInt(MAX_CAPACIDAD - MIN_CAPACIDAD + 1) + MIN_CAPACIDAD));
                botin.put("atributo_2", "Tiempo de recarga: " + (random.nextInt(MAX_RECARGA - MIN_RECARGA + 1) + MIN_RECARGA));
                botin.put("atributo_3", "Resistencia: " + (random.nextInt(MAX_RESISTENCIA - MIN_RESISTENCIA + 1) + MIN_RESISTENCIA));
                break;
            case MODIFICADOR:
                botin.put("atributo_1", "Habilidad: Aumento de daño");
                botin.put("atributo_2", "Bonificación: +" + (random.nextInt(MAX_BONIFICACION - MIN_BONIFICACION + 1) + MIN_BONIFICACION) + "%");
                botin.put("atributo_3", "Duración: " + (random.nextInt(MAX_DURACION - MIN_DURACION + 1) + MIN_DURACION) + " segundos");
                break;
        }

        return botin;
    }

    // Devuelve una descripción formateada del botín
    public static String obtenerDescripcionBotin(Map<String, Object> botin) {
        return "Tipo: " + botin.get("tipo") + "\n" + "Rareza: " + botin.get("rareza") + "\n"
                + "Atributo 1: " + botin.get("atributo_1") + "\n" + "Atributo 2: "
                + botin.get("atributo_2") + "\n" + "Atributo 3: " + botin.get("atributo_3");
    }

    // Muestra un resumen de todo el botín obtenido
    public static void mostrarResumenBotin(List<Map<String, Object>> historialBotin) {
        System.out.println("\nResumen del botín obtenido durante la sesión:");
        for (int i = 0; i < historialBotin.size(); i++) {
            System.out.println("\nBotín " + (i + 1) + ":");
            System.out.println(obtenerDescripcionBotin(historialBotin.get(i)));
        }
    }
}