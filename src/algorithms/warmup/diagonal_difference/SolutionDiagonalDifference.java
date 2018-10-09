package algorithms.warmup.diagonal_difference;

import java.math.BigDecimal;
import java.util.Scanner;

public class SolutionDiagonalDifference {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		final int size = scan.nextInt();
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		scan.close();

		BigDecimal sumDiag1 = new BigDecimal("0");
		BigDecimal sumDiag2 = new BigDecimal("0");
		int lowerLimit = size - 1;

		for (int i = 0, j = 0; i < size; i++, j++) {
			sumDiag1 = sumDiag1.add(BigDecimal.valueOf(matrix[i][j]));
			sumDiag2 = sumDiag2.add(BigDecimal.valueOf(matrix[lowerLimit - i][j]));
		}

		System.out.println(sumDiag1.subtract(sumDiag2).abs());
	}
}
