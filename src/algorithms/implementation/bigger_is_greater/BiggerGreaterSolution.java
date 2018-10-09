package algorithms.implementation.bigger_is_greater;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BiggerGreaterSolution {

	public static void main(String[] args) throws IOException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int amount = Integer.valueOf(scan.nextLine());
		StringBuilder sb = new StringBuilder();

		for (int m = 0; m < amount; m++) {

			final String word = scan.nextLine();

			final char[] charArray = word.toCharArray();

			// find the pivot
			int lastPos = word.length() - 1;
			int pivot = -1;
			for (int i = lastPos; i > 0; i--) {
				if (charArray[i - 1] < charArray[i]) {
					pivot = i - 1;
					break;
				}
			}

			if (pivot < 0) {
				System.out.println("no answer");
				sb.append("no answer" + "\n");
			} else {

				// find the greater than pivot and swap
				boolean swapDone = false;
				for (int j = lastPos; j > pivot; j--) {
					if (charArray[j] > charArray[pivot]) {
						char temp = charArray[j];
						charArray[j] = charArray[pivot];
						charArray[pivot] = temp;
						swapDone = true;
						break;
					}
				}

				// reverse the suffix
				if (swapDone) {
					int j = lastPos;
					int i = pivot + 1;
					while (i < j) {
						char temp = charArray[i];
						charArray[i] = charArray[j];
						charArray[j] = temp;
						i++;
						j--;
					}

					String newWord = new String(charArray);
					System.out.println(newWord);
					sb.append(newWord + "\n");
				} else {
					System.out.println("no answer");
					sb.append("no answer" + "\n");
				}
			}
		}
		FileWriter fw = new FileWriter("out.txt");
		fw.write(sb.toString());
		fw.flush();
		fw.close();

		scan.close();
	}
}
