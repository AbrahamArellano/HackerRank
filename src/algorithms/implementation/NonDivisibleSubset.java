package algorithms.implementation;

import java.util.Scanner;

public class NonDivisibleSubset {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}

	}
}
