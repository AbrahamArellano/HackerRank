package algorithms.strings;

import java.util.Scanner;

public class MarsExplorationSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		in.close();

		char[] letters = S.toCharArray();
		int wrongLetters = 0;

		for (int i = 0; i < letters.length; i = i + 3) {
			if (letters[i] != 'S') {
				wrongLetters++;
			}
			if (letters[i + 1] != 'O') {
				wrongLetters++;
			}
			if (letters[i + 2] != 'S') {
				wrongLetters++;
			}
		}

		System.out.println(wrongLetters);
	}
}
