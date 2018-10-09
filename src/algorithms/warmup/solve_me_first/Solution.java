package algorithms.warmup.solve_me_first;

import java.util.Scanner;

public class Solution {

	static int solveMeFirst(int a, int b) {
		// Hint: Type return a+b; below
		double check = a + b;
		int returnSum = Integer.MAX_VALUE;
		if (check <= Integer.MAX_VALUE) {
			returnSum = (int) check;
		}
		return returnSum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		in.close();
		int sum;
		sum = solveMeFirst(a, b);

		System.out.println(sum);
	}
}