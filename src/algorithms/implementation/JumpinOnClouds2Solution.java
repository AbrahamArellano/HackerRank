package algorithms.implementation;

import java.util.Scanner;

public class JumpinOnClouds2Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		in.close();

		boolean end = false;
		int pos = 0;
		int energy = 100;
		while (!end) {
			// jump
			pos = (pos + k) % n;
			energy--;

			// thunder
			if (c[pos] == 1) {
				energy -= 2;
			}

			if (pos == 0) {
				end = true;
			}
		}
		System.out.println(energy);
	}
}
