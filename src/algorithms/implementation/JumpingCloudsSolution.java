package algorithms.implementation;

import java.util.Scanner;

public class JumpingCloudsSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		in.close();

		int steps = 0;
		for (int i = 0; i < n;) {
			if (i + 2 < n && c[i + 2] == 0) {
				i += 2;
			} else if (i + 1 < n && c[i + 1] == 0) {
				i++;
			} else {
				break;
			}
			steps += 1;
		}
		System.out.println(steps);
	}

}
