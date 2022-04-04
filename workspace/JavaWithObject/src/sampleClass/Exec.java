package sampleClass;

import java.time.LocalDate;

public class Exec {

	public static void main(String[] args) {
		
		String number_p1 = "A100";
		String name_p1 = "A100";
		int price_p1 = 300000;
		LocalDate date_p1 = LocalDate.of(2022,7,8);
		boolean stock_p1 = true;
		
		String number_p2 = "A200";
		String name_p2 = "A200";
		int price_p2 = 300000;
		LocalDate date_p2 = LocalDate.of(2022,7,8);
		boolean stock_p2 = true;
		
		Product p1 = new Product(number_p1, name_p1,price_p1, date_p1, stock_p1);
		Product p2 = new Product(number_p2, name_p2,price_p2, date_p2, stock_p2);
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
		p2.setName("A200Copy");
		System.out.println(p2.getName() + "_NEW");
		
		System.out.println(p1.toString());

	}

}
