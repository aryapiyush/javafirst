package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CronoEnum {

	public static void main(String args[]) {
		CronoEnum demo = new CronoEnum();
		demo.demoTest();
	}

	public void demoTest() {

		// Get the current date
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);

		LocalTime lt = LocalTime.now();
		System.out.println("localtime :" + lt);

		System.out.println("increased time" + lt.plusHours(5));

		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);

		System.out.println("::::::::::::::::::" + ChronoUnit.WEEKS);

		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + nextMonth);

	}
}
