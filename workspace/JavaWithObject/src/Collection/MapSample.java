package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(115, "田中");
		map.put(120, "木村");
		map.put(108, "佐藤");
		map.put(112, "鈴木");
		map.put(105, "山下");
		
		System.out.println(map.get(108));
		System.out.println(map.get(210));
		System.out.println(map.getOrDefault(200, "未登録"));
		
		System.out.println("すべてのエントリを取り出す");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("不変Map");
		Map<Integer,String> map1 = Map.of(1,"A",2,"B",3,"C");
		Map<Integer,String> map2 = Map.ofEntries(Map.entry(1, "A"),Map.entry(2, "B"),Map.entry(3, "C"));
		
		//Map1
		System.out.println("Map1");
		for(Map.Entry<Integer, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		//Map2
		System.out.println("Map2");
		for(Map.Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}	

	}

}
