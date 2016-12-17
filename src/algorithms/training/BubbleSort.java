package algorithms.training;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amountNumbers = scan.nextInt();
		int[] numbers = new int[amountNumbers];
		for (int i = 0; i < amountNumbers; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		int totalSwaps = 0;
		for (int i = 0; i < amountNumbers; i++) {
			int amountSwaps = 0;
			for (int j = 0; j < amountNumbers - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					swap(numbers, j, j + 1);
					amountSwaps++;
				}
			}
			if (amountSwaps == 0) {
				break;
			}
			totalSwaps += amountSwaps;
		}

		System.out.println("Array is sorted in " + totalSwaps + " swaps.");
		System.out.println("First Element: " + numbers[0]);
		System.out.println("Last Element: " + numbers[numbers.length - 1]);
	}

	private static void swap(int[] numbers, int j, int i) {
		int tmp = numbers[j];
		numbers[j] = numbers[j + 1];
		numbers[j + 1] = tmp;
	}

}
