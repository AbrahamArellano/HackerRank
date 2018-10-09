package algorithms.implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AbsolutePermutationSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();

			Set<Integer> added = new HashSet<>();
			int[] list = new int[n];
			boolean fail = false;
			for (int i = 1; i <= n && !fail; i++) {
				if ((i - k) > 0 && (i - k) <= n && !added.contains(i - k)) {
					list[i - 1] = i - k;
					added.add(i - k);
				} else if ((i + k) > 0 && (i + k) <= n && !added.contains(i + k)) {
					list[i - 1] = i + k;
					added.add(i + k);
				} else {
					fail = true;
				}
			}

			if (fail) {
				System.out.println("-1");
			} else {
				for (int i = 0; i < n; i++) {
					System.out.print(list[i] + " ");
				}
				System.out.print("\n");
			}
		}
		in.close();
	}
}

/*
 * if (Math.abs(n - firstOption) == k) { StringBuilder sb = new StringBuilder();
 * for (int i = 0; i < n; i++) { sb.append(firstOption + i).append(" "); }
 * System.out.println(sb.toString()); } else if (Math.abs(1 - secondOption) ==
 * k) { StringBuilder sb = new StringBuilder(); for (int i = 0; i < n; i++) {
 * sb.append(secondOption + i).append(" "); } System.out.println(sb.toString());
 */

/*
 * int firstOption = k + 1; int diffUp = firstOption + (n - 1); int diffDw =
 * firstOption - (n - 1); if (diffDw > 0) { StringBuilder sb = new
 * StringBuilder(); for (int i = 0; i < n; i++) { sb.append(firstOption -
 * i).append(" "); } System.out.println(sb.toString()); } else if (diffUp > 0) {
 * StringBuilder sb = new StringBuilder(); for (int i = 0; i < n; i++) {
 * sb.append(firstOption + i).append(" "); } System.out.println(sb.toString());
 * } else { System.out.println("-1"); }
 */