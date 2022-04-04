/**
 * 
 */
package ProductClass;

import java.time.LocalDate;

/**
 * @author panzheng
 *
 */
public class Product {
	private String number;
	private String name;
	private int price;
	private LocalDate date;
	private boolean stock;

	public Product(String number, String name, int price, LocalDate date, boolean stock) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.stock = stock;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public LocalDate getDate() {
		return date;
	}

	public boolean isStock() {
		return stock;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Prouduct [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
				+ stock + "]";
	}
}
