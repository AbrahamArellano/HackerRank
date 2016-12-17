package algorithms.implementation.angry_professor;

import java.util.Scanner;

public class AngryProffesorSolution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		final int testCases = scan.nextInt();

		for (int i = 0; i < testCases; i++) {
			int students = scan.nextInt();
			int threshold = scan.nextInt();
			int onTime = 0;
			for (int j = 0; j < students; j++) {
				int timeStudent = scan.nextInt();
				if (timeStudent <= 0) {
					onTime++;
				}
			}
			if (onTime >= threshold) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
		scan.close();
	}
}
