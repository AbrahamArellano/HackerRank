package algorithms.implementation.cut_sticks;

import java.util.Arrays;
import java.util.Scanner;

public class CutSticksSolution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] listNumber = new int[n];
		for (int i = 0; i < n; i++) {
			listNumber[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(listNumber);
		int indexMin = 0;

		while (indexMin < n) {
			int amountNonZero = 0;
			if (listNumber[indexMin] > 0) {
				int rest = listNumber[indexMin];
				for (int j = indexMin; j < n; j++) {
					amountNonZero++;
					listNumber[j] = listNumber[j] - rest;
					if (listNumber[j] == 0) {
						indexMin = j + 1;
					}
				}
			} else {
				indexMin++;
			}
			if (amountNonZero > 0) {
				System.out.println(amountNonZero);
			}
		}

	}
}
