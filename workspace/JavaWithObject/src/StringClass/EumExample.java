package StringClass;

import java.util.Arrays;
import java.util.List;

public class EumExample {

	public static void main(String[] args) {
		
		List<SmartPhone> list = Arrays.asList(
				
				new SmartPhone(100, Color.WHITE),
				new SmartPhone(101, Color.BLACK),
				new SmartPhone(102, Color.BLACK),
				new SmartPhone(103, Color.GOLD)
				);
		
		list.forEach(System.out::println);
		
		Color[] values = Color.values();
		Arrays.stream(values).forEachOrdered(System.out::println);
		
		System.out.println(Color.WHITE.getModelNumber());
		System.out.println(Color.BLACK.getModelNumber());
		System.out.println(Color.GOLD.getModelNumber());

	}

}
