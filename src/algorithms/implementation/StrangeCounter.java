package algorithms.implementation;

import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double tSearch = in.nextDouble();
		in.close();
		double currValue = 3;
		double minRang = 1;
		double maxRang = 3;
		double prevRange = 0;

		double i = 1;
		boolean found = false;
		while (!found) {
			currValue = currValue * i;
			minRang = prevRange + 1;
			maxRang = currValue + prevRange;
			prevRange = maxRang;
			if (tSearch >= minRang && tSearch <= maxRang) {
				while (!found) {
					if (minRang == tSearch) {
						System.out.println((int) currValue);
						found = true;
					} else {
						currValue--;
						minRang++;
					}
				}
			}
			i = 2;
		}
	}
}
