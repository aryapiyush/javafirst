package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDT {

	public static void main(String args[]) {
		LocalDT ldt = new LocalDT();
		ldt.demo();
	}

	public void demo() {

		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);

		System.out.println("current date     " + currentTime.toLocalDate());
		System.out.println("maonth     "
				+ currentTime.getMonth().toString().toLowerCase());
		System.out.println("day   " + currentTime.getDayOfMonth());
		System.out.println("second     " + currentTime.getSecond());

		// 10 oct 2012
		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
		System.out.println("date2: " + date2);

		// 12 december 2014
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("date3: " + date3);

		// 22 hour 15 minutes
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("date4: " + date4);

		// parse a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("date5: " + date5);
	}
}
