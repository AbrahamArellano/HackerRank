package algorithms.training;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateConditional {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day1 = scan.nextInt();
		int month1 = scan.nextInt();
		int year1 = scan.nextInt();

		int day2 = scan.nextInt();
		int month2 = scan.nextInt();
		int year2 = scan.nextInt();

		scan.close();

		LocalDate date1 = LocalDate.of(year1, month1, day1);
		LocalDate date2 = LocalDate.of(year2, month2, day2);

		long fine = 0;
		if (date1.isBefore(date2) || date1.isEqual(date2)) {
			fine = 0;
		} else if (date1.isAfter(date2) && date1.getMonth() == date2.getMonth() && date1.getYear() == date2.getYear()) {
			final long daysBetween = ChronoUnit.DAYS.between(date2, date1);
			fine = 15 * daysBetween;
		} else if (date1.isAfter(date2) && date1.getYear() == date2.getYear()) {
			final long monthsBetween = ChronoUnit.MONTHS.between(date2, date1);
			fine = 500 * monthsBetween;
		} else {
			fine = 10000;
		}
		System.out.println(fine);
	}

}
