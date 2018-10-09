package algorithms.warmup.time_conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SolutionTimeConversion {

	public static void main(String[] args) throws ParseException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssaa");
		final Date parse = sdf.parse(scan.nextLine());
		scan.close();

		sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(parse));
	}
}
