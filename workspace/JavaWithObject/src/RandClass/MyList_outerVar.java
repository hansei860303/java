package RandClass;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyList_outerVar {

	public static void main(String[] args) {
		
		List<Book> list = Arrays.asList(
				new Book("120","german","Janssen",LocalDate.of(2017,9,18),1500),
				new Book("310","japanese","テスト1",LocalDate.of(2017,3,5),5500),
				new Book("400","english","テスト2",LocalDate.of(2018,2,11),4500),
				new Book("100","japanese","テスト3",LocalDate.of(2018,1,10),2200),
				new Book("410","english","テスト4",LocalDate.of(2017,12,1),5500)
				);
		
		Book ref = new Book("250","german","テスト2",LocalDate.of(2017,9,18),1500);
		
		//listup(list,ref::isSameAuthor);
		listup(list,book -> ref.isSameAuthor(book));

	}
	
	public static void listup(List<Book> list,Predicate<Book> p) {
		for(Book book : list) {
			if(p.test(book)) {
				System.out.println(book);
			}
		}
	}

}
