package StringClass;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws IOException {
		
		String dt ="100, ìcíÜÅ@çL,  60.5";
		String[] dts = dt.split("\\s*,\\s*");
		Arrays.stream(dts).forEach(System.out::println);
		
		List<String> list = Arrays.asList("Jack110","suzu-10","Ken3","tom10");
		for(String s: list) {
			
			if(s.matches("^(?=.*[A-Z])(?!.*\\W).{5,}$")) {
				System.out.println(s);
			}
		}
		
		Path path = Paths.get("temp/test/data.txt");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(path);
		in.useDelimiter("[ \t]+|" + System.lineSeparator());
		while(in.hasNext()) {
			int number = in.nextInt();
			String name = in.next();
			double weight = in.nextDouble();
			System.out.println(number + "\t" + name + "\t" + weight);
		}
	}

}
