package algorithms.warmup.circular_array_rotation;

import java.util.Scanner;

public class SolutionCircularArrayRotation {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int q = scan.nextInt();

		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}

		int ini = k % n;
		ini = n - ini;

		for (int i = 0; i < q; i++) {
			int m = scan.nextInt();
			int pos = (m + ini) % n;
			System.out.println(list[pos]);
		}
		scan.close();
	}
}
