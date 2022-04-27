package OtherClass;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.of(15, 20, 35);
		System.out.println(time);
		
		LocalDateTime datetime = LocalDateTime.of(2020,2,12,15,20,35);
		System.out.println(datetime);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ahhéûmmï™ssïb");
		System.out.println(time.format(fmt));
		
		LocalTime start = LocalTime.of(12, 10, 30);
		LocalTime goal = LocalTime.of(16, 46, 25);
		System.out.println(start + "Å`" + goal);
		
		Duration d = Duration.between(start, goal);
		
		System.out.println(d.toSeconds());
		System.out.println(d.toMinutesPart());
		System.out.println(d.toSecondsPart());

	}

}
