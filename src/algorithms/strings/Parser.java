package algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Parser {

	public boolean checkParenthesesBalance(String word) {
		if (word == null) {
			return false;
		}
		if (word.isEmpty()) {
			return true;
		}
		Set<Character> startParentheses = startSetOfCharacters();
		Set<Character> endParentheses = endSetOfCharacters();
		Map<Character, Character> mappingOpenEnd = createMapping();
		Stack<Character> stackOfChars = new Stack<>();

		for (int i = 0; i < word.length(); i++) {
			char currChar = word.charAt(i);
			if (startParentheses.contains(currChar)) {
				stackOfChars.push(currChar);
			} else if (endParentheses.contains(currChar)) {
				if (stackOfChars.isEmpty()) {
					return false;
				} else {
					char popedChar = stackOfChars.pop();
					char expectedClosing = mappingOpenEnd.get(popedChar);
					if (currChar != expectedClosing) {
						return false;
					}
				}
			}

		}
		if (stackOfChars.isEmpty()) {
			return true;
		}
		return false;
	}

	private Map<Character, Character> createMapping() {
		Map<Character, Character> mapping = new HashMap<>();
		mapping.put('(', ')');
		mapping.put('[', ']');
		mapping.put('{', '}');
		return mapping;
	}

	private Set<Character> endSetOfCharacters() {
		Set<Character> endParentheses = new HashSet<>();
		endParentheses.add(')');
		endParentheses.add(']');
		endParentheses.add('}');
		return endParentheses;
	}

	private Set<Character> startSetOfCharacters() {
		Set<Character> startParentheses = new HashSet<>();
		startParentheses.add('(');
		startParentheses.add('[');
		startParentheses.add('{');
		return startParentheses;
	}

	public static void main(String[] argh) {
		Parser X = new Parser();
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(X.checkParenthesesBalance(in.next()));
		}

	}
}
