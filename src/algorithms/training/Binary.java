package algorithms.training;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		int maxCount = 0;
		int count = 0;
		char one = '1';
		char[] binaryArray = binary.toCharArray();

		for (char c : binaryArray) {
			if (c == one) {
				count++;
				if (count > maxCount) {
					maxCount = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println(maxCount);

	}
}
