package ejercicio5_rotacion;

import java.util.Scanner;

public class JoyeroPerlas {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();  // Número de filas y columnas del joyero

			int[][] joyero = new int[n][n]; // Matriz para almacenar la cantidad de perlas
			for (int i = 0; i < n; i++) {
			    for (int j = 0; j < n; j++) {
			        joyero[i][j] = sc.nextInt();
			    }
			}

			int rotaciones = 0; 
			while (!ordenado(joyero)) { // Mientras el joyero no esté ordenado
			    joyero = rotar(joyero);  // Rotar el joyero 90 grados antihorario
			    rotaciones++;
			}

			System.out.println(rotaciones); // Imprimir el número de rotaciones
		}
    }

    // Método para rotar una matriz 90 grados antihorario
    static int[][] rotar(int[][] matriz) {
        int n = matriz.length;
        int[][] rotado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotado[n - j - 1][i] = matriz[i][j];
            }
        }

        return rotado;
    }

    // Método para comprobar si el joyero está ordenado
    static boolean ordenado(int[][] joyero) {
        int n = joyero.length;

        // Comprobar orden creciente en las columnas
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < n; i++) {
                if (joyero[i][j] <= joyero[i - 1][j]) {
                    return false;
                }
            }
        }

        // Comprobar orden creciente en las filas
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (joyero[i][j] <= joyero[i][j - 1]) {
                    return false;
                }
            }
        }

        return true; // Si pasa todas las comprobaciones, el joyero está ordenado
    }
}