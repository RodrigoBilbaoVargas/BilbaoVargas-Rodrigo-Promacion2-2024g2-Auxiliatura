package ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Crear personajes
        Mago mago = new Mago("Mago Sabio", random.nextInt(10) + 1, 100, 50);
        Guerrero guerrero = new Guerrero("Guerrero Feroz", random.nextInt(10) + 1, 100, 30);
        Arquero arquero = new Arquero("Arquero Preciso", random.nextInt(10) + 1, 100, 25);

        // Crear enemigos
        Enemigo[] enemigos = {
            new Zombie("Zombie Hambriento", 50, 10),
            new Vampiro("Vampiro Sanguinario", 80, 15),
            new Jefe("Jefe Malvado", 120, 20, 2.5)
        };

        // Seleccionar personaje
        Personaje jugador = seleccionarPersonaje(scanner, mago, guerrero, arquero);
        System.out.println("\n¡Has elegido a " + jugador.nombre + "!\n");

        // Mostrar estado inicial
        jugador.mostrarEstado();
        for (Enemigo enemigo : enemigos) {
            enemigo.mostrarEstado();
        }

        // Seleccionar enemigo
        Enemigo enemigo = seleccionarEnemigo(scanner, enemigos);
        System.out.println("\n¡Te enfrentas a " + enemigo.nombre + "!\n");

        // Lógica del combate
        while (jugador.puntosDeVida > 0 && enemigo.estaVivo()) {
            // Turno del jugador
            System.out.println("\nTurno de " + jugador.nombre + ": ¿Qué deseas hacer?");
            System.out.println("1. Atacar");
            System.out.println("2. Usar un hechizo (solo Mago)");
            System.out.println("3. Curarse");
            System.out.println("4. Huir");
            int accion = scanner.nextInt();

            switch (accion) {
                case 1: // Atacar
                    atacarJugador(jugador, enemigo, random);
                    break;

                case 2: // Usar hechizo (solo Mago)
                    if (jugador instanceof Mago) {
                        ((Mago) jugador).lanzarHechizo();
                        int dañoHechizo = random.nextInt(11) + 15; // Daño entre 15 y 25
                        enemigo.recibirDaño(dañoHechizo);
                        System.out.println(jugador.nombre + " lanza un hechizo a " + enemigo.nombre + " causando " + dañoHechizo + " puntos de daño.");
                    } else {
                        System.out.println("¡Solo un Mago puede usar un hechizo!");
                    }
                    break;

                case 3: // Curarse
                    curarJugador(jugador);
                    break;

                case 4: // Huir
                    System.out.println(jugador.nombre + " ha decidido huir del combate.");
                    return;

                default:
                    System.out.println("Acción no válida.");
                    break;
            }

            // Verificar si el enemigo está vivo
            if (!enemigo.estaVivo()) {
                System.out.println(enemigo.nombre + " ha sido derrotado. ¡" + jugador.nombre + " gana!");
                break;
            }

            // Turno del enemigo
            atacarEnemigo(enemigo, jugador);
        }

        // Fin del juego si el jugador es derrotado
        if (jugador.puntosDeVida <= 0) {
            System.out.println(jugador.nombre + " ha sido derrotado. ¡El enemigo gana!");
        }

        scanner.close();
    }

    private static Personaje seleccionarPersonaje(Scanner scanner, Mago mago, Guerrero guerrero, Arquero arquero) {
        System.out.println("Elige tu personaje: ");
        System.out.println("1. " + mago.nombre);
        System.out.println("2. " + guerrero.nombre);
        System.out.println("3. " + arquero.nombre);
        int eleccion = scanner.nextInt();
        switch (eleccion) {
            case 1:
                return mago;
            case 2:
                return guerrero;
            case 3:
                return arquero;
            default:
                System.out.println("Opción no válida. Se elige Guerrero por defecto.");
                return guerrero;
        }
    }

    private static Enemigo seleccionarEnemigo(Scanner scanner, Enemigo[] enemigos) {
        System.out.println("Elige tu enemigo:");
        for (int i = 0; i < enemigos.length; i++) {
            System.out.println((i + 1) + ". " + enemigos[i].nombre);
        }
        int enemigoEleccion = scanner.nextInt();
        return enemigos[enemigoEleccion - 1];
    }

    private static void atacarJugador(Personaje jugador, Enemigo enemigo, Random random) {
        int daño = random.nextInt(11) + 10; // Daño entre 10 y 20
        enemigo.recibirDaño(daño);
        System.out.println(jugador.nombre + " ataca a " + enemigo.nombre + " causando " + daño + " puntos de daño.");
        enemigo.mostrarEstado();
    }

    private static void curarJugador(Personaje jugador) {
        int puntosCurar = 20;
        if (jugador.puntosDeVida + puntosCurar > 100) { // Suponiendo 100 como puntos de vida máxima
            puntosCurar = 100 - jugador.puntosDeVida; // Ajustar la curación para no exceder el máximo
        }
        jugador.puntosDeVida += puntosCurar; // Curar
        System.out.println(jugador.nombre + " se ha curado " + puntosCurar + " puntos de vida.");
        jugador.mostrarEstado();
    }

    private static void atacarEnemigo(Enemigo enemigo, Personaje jugador) {
        int dañoEnemigo = enemigo.atacar();
        jugador.recibirDaño(dañoEnemigo);
        System.out.println(enemigo.nombre + " ataca a " + jugador.nombre + " causando " + dañoEnemigo + " puntos de daño.");
        jugador.mostrarEstado();
    }
}
