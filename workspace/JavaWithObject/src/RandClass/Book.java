package RandClass;

import java.time.LocalDate;

public class Book {
	
	private String code;
	private String language;
	private String author;
	private LocalDate date;
	private int price;
	
	
	
	public Book(String code, String language, String author, LocalDate date, int price) {
		this.code = code;
		this.language = language;
		this.author = author;
		this.date = date;
		this.price = price;
		
	}
	
	
	public String getCode() {
		return code;
	}
	public String getLanguage() {
		return language;
	}
	public String getAuthor() {
		return author;
	}
	public LocalDate getDate() {
		return date;
	}
	public int getPrice() {
		return price;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [code=" + code + ", language=" + language + ", author=" + author + ", date=" + date + ", price="
				+ price + "]";
	}
	

}
