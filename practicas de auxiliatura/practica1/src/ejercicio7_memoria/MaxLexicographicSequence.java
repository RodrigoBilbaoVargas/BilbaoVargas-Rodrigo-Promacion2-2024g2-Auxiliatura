package ejercicio7_memoria;

import java.util.Scanner;

public class MaxLexicographicSequence {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] numbers = new int[n];

			for (int i = 0; i < n; i++) {
			    numbers[i] = scanner.nextInt();
			}

			int[] maxSequence = maxLexicographicSequence(n, numbers);

			for (int num : maxSequence) {
			    System.out.print(num + " ");
			}
		}
    }

    public static int[] maxLexicographicSequence(int n, int[] numbers) {
        int[] bitsCount = new int[32];

        // Count bits for each number
        for (int num : numbers) {
            for (int i = 0; i < 32; i++) {
                bitsCount[i] += (num >> i) & 1;
            }
        }

        int[] maxSequence = new int[n];
        // Build the max lexicographic sequence
        for (int i = 0; i < n; i++) {
            int maxNum = 0;
            // Try to construct the maximum number bit by bit
            for (int j = 31; j >= 0; j--) {
                // Check if the bit can be used
                if (bitsCount[j] > 0) {
                    maxNum |= (1 << j);
                    bitsCount[j]--;
                }
            }
            maxSequence[i] = maxNum;
        }

        return maxSequence;
    }
}