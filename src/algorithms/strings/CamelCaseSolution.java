package algorithms.strings;

import java.util.Scanner;

public class CamelCaseSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] letters = s.toCharArray();
		in.close();

		int words = 0;
		if (letters.length > 0) {
			words++;
		}

		for (int i = 0; i < letters.length; i++) {
			if (letters[i] >= 'A' && letters[i] <= 'Z') {
				words++;
			}
		}

		System.out.println(words);
	}
}
