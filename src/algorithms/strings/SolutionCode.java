package algorithms.strings;

import java.util.Scanner;

//Complete the main function
public class SolutionCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		myCalculator calculator = new myCalculator();
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			try {
				System.out.println(calculator.power(n, p));
			} catch (Exception e) {
				System.out.println("java.lang.Exception: " + e.getMessage());
			}
		}
		sc.close();
	}
}

class myCalculator {

	int power(int n, int p) throws Exception {
		if (n < 0 || p < 0)
			throw new Exception("n and p should be non-negative");
		if (p == 0)
			return 1;
		return n * power(n, p - 1);
	}
}
