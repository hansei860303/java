package OtherClass;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CreateDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate newDay = today.plusDays(120);
		System.out.println(newDay);
		long days = ChronoUnit.DAYS.between(today, newDay);
		System.out.println(days);
		Period period = Period.between(today, newDay);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		LocalDate date = LocalDate.of(2021, 12, 8);
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.isAfter(today));
		System.out.println(date.isBefore(today));
		System.out.println(date.isEqual(today));
		System.out.println(date.isLeapYear());
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y年MM月dd日　eeee");
		System.out.println(date.format(fmt));
		
		JapaneseDate jdate = JapaneseDate.from(date);
		DateTimeFormatter fmt_J = DateTimeFormatter.ofPattern("Gy年MM月dd日　eeee");
		
		System.out.println(jdate.format(fmt_J));
		
		

	}

}
