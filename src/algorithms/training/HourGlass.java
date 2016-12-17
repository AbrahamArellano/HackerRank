package algorithms.training;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				// location of glass
				int sum = arr[0 + i][0 + j] + arr[0 + i][1 + j] + arr[0 + i][2 + j] + arr[1 + i][1 + j]
						+ arr[2 + i][0 + j] + arr[2 + i][1 + j] + arr[2 + i][2 + j];
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
}
