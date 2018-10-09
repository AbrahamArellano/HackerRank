package algorithms.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAnagrams {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int cases = Integer.valueOf(scan.nextLine());
		for (int m = 0; m < cases; m++) {
			String word = scan.nextLine();
			int amount = 0;
			for (int size = 1; size < word.length(); size++) {
				Map<String, Integer> map = new HashMap<String, Integer>();
				for (int i = 0; i < word.length() && (i + size) <= word.length(); i++) {
					char[] s1 = word.substring(i, i + size).toCharArray();
					Arrays.sort(s1);
					final String ordered = new String(s1);
					Integer currSum = map.get(ordered);
					if (currSum != null) {
						amount += currSum;
						map.put(ordered, currSum + 1);
					} else {
						map.put(ordered, 1);
					}

					// System.out.println(word.substring(i, i + size));
					// for (int j = i + 1; j < word.length() && (j + size <=
					// word.length()); j++) {
					// String s1 = word.substring(i, i + size);
					// String s2 = word.substring(j, j + size);
					// System.out.println(s1 + " - " + s2);
					// }
				}
			}
			System.out.println(amount);
		}
		scan.close();
	}
}
