package DateTime;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;

public class PeriodAndDurationDemo {

	public static void main(String args[]) {
		PeriodAndDurationDemo demo = new PeriodAndDurationDemo();
		demo.demoPeriod();
		demo.demoDuration();
	}

	public void demoPeriod() {

		// Get the current date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date: " + currentDate);

		// add 1 month to the current date
		LocalDate incMonth = currentDate.plus(3, ChronoUnit.MONTHS);
		System.out.println("Next month: " + incMonth);

		Period period = Period.between(incMonth, currentDate);
		System.out.println("Period: " + period);
	}

	public void demoDuration() {
		LocalTime localTime = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);

		LocalTime extdTime = localTime.plus(twoHours);
		Duration duration = Duration.between(localTime, extdTime);

		System.out.println("Duration: " + duration);
	}
}
