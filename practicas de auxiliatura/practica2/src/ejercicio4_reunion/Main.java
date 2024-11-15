package ejercicio4_reunion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de N (número de directores) y K (duración máxima de la reunión)
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Variable para almacenar el tiempo máximo que puede durar cada discurso
        int tiempoMaximoDiscurso = (K - (N - 1)) / N;

        System.out.println(tiempoMaximoDiscurso);

        scanner.close();
    }
}