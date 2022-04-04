package ProductClass;

import java.time.LocalDate;

public class ExecMethod {
	
	public static void main(String[] args) {
		
		String number_p1 = "A100";
		String name_p1 = "A100";
		int price_p1 = 300000;
		LocalDate date_p1 = LocalDate.of(2022,7,8);
		boolean stock_p1 = true;
		
		Product p1 = new Product(number_p1, name_p1, price_p1, date_p1, stock_p1);
		
		//ä‘ê⁄ìIÇ»ë„ì¸
		sub(p1);
		
		System.out.println("p1=" + p1);

	}
	
	public static void sub(Product p2) {
		p2.setPrice(40200);
		System.out.print("p2=" + p2);
	}

}
