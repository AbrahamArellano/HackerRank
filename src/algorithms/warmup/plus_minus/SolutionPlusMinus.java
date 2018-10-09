package algorithms.warmup.plus_minus;

import java.util.Scanner;

public class SolutionPlusMinus {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		final int amount = scan.nextInt();
		int positive = 0;
		int negative = 0;
		int zeroes = 0;

		for (int i = 0; i < amount; i++) {
			int number = scan.nextInt();
			if (number > 0) {
				positive++;
			} else if (number < 0) {
				negative++;
			} else if (number == 0) {
				zeroes++;
			} else {
				scan.close();
				throw new RuntimeException();
			}
		}
		scan.close();

		double positiveFrac = Double.valueOf(positive) / amount;
		double negativeFrac = Double.valueOf(negative) / amount;
		double zeroesFrac = Double.valueOf(zeroes) / amount;

		System.out.println(positiveFrac);
		System.out.println(negativeFrac);
		System.out.println(zeroesFrac);
	}
}
