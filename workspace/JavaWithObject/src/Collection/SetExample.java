package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> ids = new HashSet<>();
		ids.add("アンパンマン");
		ids.add("スーパーマン");
		ids.add("バッドマン");
		ids.add("スパイダーマン");
		ids.add("バッドマン");
		System.out.println("HashSet");
		for(String id : ids) {
			System.out.println(id);
		}
		
		Set<String> ids1 = new TreeSet<>();
		ids1.add("アンパンマン");
		ids1.add("スーパーマン");
		ids1.add("バッドマン");
		ids1.add("スパイダーマン");
		ids1.add("バッドマン");
		System.out.println("TreeSet");
		for(String id : ids1) {
			System.out.println(id);
		}
	}

}
