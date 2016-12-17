package algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewYearChaosSolution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner scan = new Scanner(System.in);
		int amountTestCases = scan.nextInt();

		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < amountTestCases; i++) {
			int peopleOnQueue = scan.nextInt();
			int[] queue = new int[peopleOnQueue];
			for (int j = 0; j < peopleOnQueue; j++) {
				int posPeople = scan.nextInt();
				queue[j] = posPeople;
			}
			list.add(queue);
		}
		scan.close();

		for (int[] currQueue : list) {
			long start = System.nanoTime();

			boolean tooChaotic = false;

			for (int pos = (currQueue.length); pos > 0 && !tooChaotic; pos--) {
				int diff = currQueue[pos - 1] - pos;
				if (diff >= 3) {
					System.out.println("Too chaotic");
					tooChaotic = true;
				}
			}
			if (!tooChaotic) {
				int sum = 0;
				boolean changed = true;
				for (int i = 0; i < currQueue.length - 1 && changed; i++) {
					changed = false;
					for (int j = 0; j < currQueue.length - i - 1; j++) {
						if (currQueue[j] > currQueue[j + 1]) {
							int temp = currQueue[j];
							currQueue[j] = currQueue[j + 1];
							currQueue[j + 1] = temp;
							sum++;
							changed = true;
						}
					}
				}
				System.out.println(sum);
			}
			long end = System.nanoTime();
			System.out.println("Time: " + (end - start));
		}
	}
}
