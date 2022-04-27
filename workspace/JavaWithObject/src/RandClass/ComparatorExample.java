package RandClass;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Book> list = Arrays.asList(
				new Book("120","german","テスト5",LocalDate.of(2017,9,18),9900),
				new Book("310","japanese","テスト1",LocalDate.of(2017,3,5),5500),
				new Book("400","english","テスト2",LocalDate.of(2018,2,11),4500),
				new Book("100","japanese","テスト3",LocalDate.of(2018,1,10),2200),
				new Book("410","english","テスト4",LocalDate.of(2017,12,1),5500)
				);
		
		list.sort(comparing(Book::getPrice).thenComparing(Book::getCode).reversed());
		
		list.forEach(System.out :: println);
		
		list.forEach(book -> System.out.println(book.getAuthor()));
		
	}

}
