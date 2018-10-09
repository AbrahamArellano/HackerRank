package algorithms.sorting;

import java.util.Scanner;

public class InsertionSort1 {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int ePos = ar.length - 1;
		int e = ar[ePos];

		if (ar.length == 0 || ar.length == 1) {
			printArray(ar);
		} else {

			boolean ordered = false;
			for (int i = ar.length - 2; i >= 0 && !ordered; i--) {
				if (e < ar[i]) {
					ar[i + 1] = ar[i];
				} else {
					ar[i + 1] = e;
					ordered = true;
				}
				printArray(ar);
			}
			if (!ordered) {
				ar[0] = e;
				printArray(ar);
			}
		}
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
