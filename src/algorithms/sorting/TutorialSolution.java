package algorithms.sorting;

import java.util.Scanner;

public class TutorialSolution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int V = scan.nextInt();
		int n = scan.nextInt();
		boolean found = false;
		int solution = 0;
		for (int i = 0; i < n && !found; i++) {
			int num = scan.nextInt();
			if (num == V) {
				solution = i;
				found = true;
			}
		}
		scan.close();
		System.out.println(solution);
    }
}

/*

-12
6
1 4 5 7 9 -12

*/