package algorithms.implementation.save_prisioners;

import java.util.Scanner;

public class SavePrisioner {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		final int cases = scan.nextInt();
		for (int i = 0; i < cases; i++) {
			long prisioners = scan.nextLong();
			long sweets = scan.nextLong();
			long pID = scan.nextLong();
			pID--;

			long r = (sweets - 1) % prisioners;
			long prisioner = (pID + r) % prisioners;
			System.out.println(prisioner + 1);
		}
		scan.close();
	}
}
