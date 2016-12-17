package algorithms.training;

import java.util.Scanner;

public class Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int n = Integer.valueOf(scan.nextLine());
    	
    	for (int i = 0; i < n; i++) {
    		String line = scan.nextLine();
    		char[] letters = line.toCharArray();
    		StringBuilder even = new StringBuilder();
    		StringBuilder odd = new StringBuilder();
    		
    		for (int j = 0; j < letters.length; j++) {
    			if (j % 2 == 0) {
    				even.append(letters[j]);
    			} else {
    				odd.append(letters[j]);
    			}
    		}
    		
    		System.out.println(even + " " + odd);
    	}
    	scan.close();
    }
}
