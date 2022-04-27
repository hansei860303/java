package StringClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class ConstructorExample {

	public static void main(String[] args) throws IOException {
		
		byte[] bytes = Files.readAllBytes(Paths.get("temp/test/sample.html"));
		String str = new String(bytes,"UTF-8");
		System.out.println(str);
		
		String[] array = {"2020","07","15"};
		System.out.println(String.join("-", array));
		System.out.println(String.join("\n", array));
		
		String str2 = "01/15 ¶”N‚Ì“ú/n" + "02/11 Œš‘‹L”O‚Ì“ú/n" + "04/29 ‚İ‚Ç‚è‚Ì“ú";
		System.out.println(str2.replace("/", "-"));
		
		String data  = "Œ,‰Î,…,–Ø,‹à";
		String[] dayOfWeek = data.split(",");
		Arrays.stream(dayOfWeek).forEach(System.out::println);
		
		List<String> list = Arrays.asList("Bb","ac","ba");
		list.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
		System.out.println(list);
		
		list.sort((s1,s2) -> s1.compareTo(s2));
		System.out.println(list);

	}

}
