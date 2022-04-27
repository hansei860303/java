package OtherClass;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class AdjustExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021, 6, 12);
		System.out.println(date);
		
		TemporalAdjuster nextMonday = TemporalAdjusters.next(DayOfWeek.MONDAY);
		System.out.println(date.with(nextMonday));
		
		TemporalAdjuster lastDay = TemporalAdjusters.lastDayOfMonth();
		System.out.println(date.with(lastDay));
		
		LocalDate date2 = LocalDate.now().with(lastDay).with(nextMonday);
		System.out.println(date2);

	}

}
