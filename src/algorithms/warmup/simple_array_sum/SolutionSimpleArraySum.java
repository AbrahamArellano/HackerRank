package algorithms.warmup.simple_array_sum;

import java.math.BigInteger;
import java.util.Scanner;

public class SolutionSimpleArraySum {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int amountInts = scan.nextInt();
		BigInteger sum = new BigInteger("0");
		for (int i = 0; i < amountInts; i++) {
			sum = sum.add(BigInteger.valueOf(scan.nextInt()));
		}
		scan.close();
		System.out.println(sum.toString());
	}
}
