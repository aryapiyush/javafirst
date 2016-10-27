package DateTime;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeDemo {

	public static void main(String args[]) {
		ZonedDateTimeDemo zdt = new ZonedDateTimeDemo();
		zdt.demo();
	}

	public void demo() {

		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime
				.parse("2016-10-27T10:15:30+05:30[Asia/Calcutta]");
		System.out.println("date1: " + date1);

		System.out.println(ZoneId.of("Europe/Paris"));

		System.out.println(ZoneId.systemDefault());
	}

}
