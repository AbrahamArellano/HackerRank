package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstructionSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String s = in.next();
			Set<String> lookup = new HashSet<String>();
			char[] letters = s.toCharArray();
			StringBuilder p = new StringBuilder();
			int cost = 0;

			for (int i = 0; i < letters.length;) {
				boolean added = false;
				String wordToAdd = null;
				for (int j = i + 1; j <= letters.length && !added; j++) {
					wordToAdd = s.substring(i, j);
					if (!lookup.contains(wordToAdd) && !p.toString().contains(wordToAdd)) {
						added = true;
						p.append(wordToAdd);
						cost++;
					}
					lookup.add(wordToAdd);
					i = j;
				}
				if (!added && wordToAdd != null) {
					p.append(wordToAdd);
				}
			}

			System.out.println(cost);
		}
		in.close();
	}
}
