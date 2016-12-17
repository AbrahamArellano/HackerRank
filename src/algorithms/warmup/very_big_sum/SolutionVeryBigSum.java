package algorithms.warmup.very_big_sum;

import java.math.BigInteger;
import java.util.Scanner;

public class SolutionVeryBigSum {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		BigInteger sum = new BigInteger("0");
		for (int i = 0; i < amount; i++) {
			sum = sum.add(BigInteger.valueOf(scan.nextInt()));
		}
		scan.close();
		System.out.println(sum);
	}
}
