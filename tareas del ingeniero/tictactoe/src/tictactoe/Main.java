package tictactoe;

import java.util.Scanner;

public class Main {
    private char[][] board;
    private char currentPlayer;

    public Main() {
        board = new char[3][3];
        currentPlayer = 'X'; // El jugador X comienza
        initializeBoard();
    }

    // Inicializa el tablero con espacios vacíos
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Imprime el tablero
    public void printBoard() {
        System.out.println("   0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---+---+---");
        }
    }

    // Cambia el jugador
    private void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Verifica si hay un ganador
    private boolean checkForWin() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }
        // Verificar diagonales
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    // Verifica si el tablero está lleno
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Método principal para jugar
    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Jugador " + currentPlayer + ", ingresa tu fila y columna (ejemplo: 1 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
                continue;
            }

            board[row][col] = currentPlayer;

            if (checkForWin()) {
                printBoard();
                System.out.println("¡Jugador " + currentPlayer + " gana!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("¡Es un empate!");
                break;
            }

            changePlayer();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Main game = new Main();
        game.play();
    }
}