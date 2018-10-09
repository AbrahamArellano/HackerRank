package algorithms.warmup.staircase;

import java.util.Scanner;

public class SolutionStaircase {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int stairs = scan.nextInt();
		scan.close();

		for (int i = 1; i <= stairs; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < stairs; j++) {
				if ((stairs - j) <= i) {
					sb.append("#");
				} else {
					sb.append(" ");
				}
			}
			System.out.println(sb);
		}
	}
}
