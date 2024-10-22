package ejercicio6_Charles;

import java.util.Scanner;

public class FraccionContinua {
    // Función para calcular el numerador de la fracción P_N
    public static int calcularNumerador(int N) {
        // Numeradores y denominadores para la fracción continua
        int numerator = 1;
        int denominator = 1;

        // Se comienza a calcular desde N hasta 1
        for (int i = 1; i < N; i++) {
            int temp = denominator;
            denominator = numerator + denominator;
            numerator = temp;
        }

        return denominator; // El numerador de la fracción P_N
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();
        scanner.close();

        // Calcular y mostrar el numerador
        int resultado = calcularNumerador(N);
        System.out.println("El numerador de P_" + N + " es: " + resultado);
    }
}