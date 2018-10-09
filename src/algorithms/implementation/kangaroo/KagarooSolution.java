package algorithms.implementation.kangaroo;

import java.util.Scanner;

public class KagarooSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		in.close();

		System.out.println((v1 > v2 && (x2 - x1) % (v1 - v2) == 0) ? "YES" : "NO");
		//
		// if (v2 >= v1) {
		// System.out.println("NO");
		// } else {
		// boolean solution = false;
		// for (int i = 0; !solution; i++) {
		// int pos1 = x1 + (v1 * i);
		// int pos2 = x2 + (v2 * i);
		// if (pos1 == pos2) {
		// System.out.println("YES");
		// solution = true;
		// } else if (pos1 > pos2) {
		// System.out.println("NO");
		// solution = true;
		// }
		// }
		// }

	}
}
