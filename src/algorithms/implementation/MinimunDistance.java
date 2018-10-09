package algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimunDistance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}
		in.close();

		if (A.length <= 1) {
			System.out.println("-1");
		} else {
			Map<Integer, Integer> map = new HashMap<>();
			int minDist = Integer.MAX_VALUE;
			boolean found = false;
			for (int i = 0; i < A.length; i++) {
				if (map.containsKey(A[i])) {
					int pos = map.get(A[i]);
					int tmpDis = Math.abs(pos - i);
					if (tmpDis < minDist) {
						minDist = tmpDis;
						found = true;
					}
				}
				map.put(A[i], i);
			}
			System.out.println(found ? minDist : "-1");
		}

	}
}
