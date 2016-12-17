package algorithms.warmup.compare_triplets;

import java.util.Scanner;

public class SolutionCompareTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		a[0] = in.nextInt();
		a[1] = in.nextInt();
		a[2] = in.nextInt();
		b[0] = in.nextInt();
		b[1] = in.nextInt();
		b[2] = in.nextInt();

		in.close();

		int pointsA = 0;
		int pointsB = 0;

		for (int i = 0; i < 3; i++) {
			if (a[i] > b[i]) {
				pointsA++;
			} else if (a[i] < b[i]) {
				pointsB++;
			}
		}

		System.out.println(pointsA + " " + pointsB);
	}
}
