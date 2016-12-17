package algorithms.implementation.beautiful_triplet;

import java.util.Scanner;

public class BeautifulTriplet {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();

		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		int beauty = 0;
		for (int i = 0; i < n; i++) {
			out1: for (int j = 1; j < n; j++) {
				int diff1 = numbers[j] - numbers[i];
				if (diff1 < d) {
					continue out1;
				}
				if (diff1 > d) {
					break out1;
				}
				out2: for (int k = 2; k < n; k++) {
					int diff2 = numbers[k] - numbers[j];
					if (diff2 < d) {
						continue out2;
					}
					if (diff2 > d) {
						break out2;
					}
					if (diff1 == diff2 && diff1 == d) {
						beauty++;
					}
				}
			}
		}
		System.out.println(beauty);
	}
}
