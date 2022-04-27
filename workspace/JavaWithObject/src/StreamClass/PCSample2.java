package StreamClass;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class PCSample2 {

	public static void main(String[] args) {
		
		List<PC> pcList = getList();
		
		if(pcList.stream().anyMatch(pc -> "Ariban".equals(pc.getName()))) {
			System.out.println("Aribanがあります");
		}else {	
			System.out.println("Aribanがありません");
		}
		
		System.out.println("------------------------");
		
		if(pcList.stream().noneMatch(pc -> "Ariban".equals(pc.getName()))) {
			System.out.println("Aribanがありません");
			
		}else {	
			System.out.println("Aribanがあります");
		}
		
		System.out.println("------------------------");
		
		PC nonePC = new PC(null, null, 0, null);
		nonePC.setName("No-exist");
		
		Optional<PC> anyPC = pcList.stream()
				.filter(pc -> "Panann".equals(pc.getMaker()))
				.findAny();
		
		System.out.println(anyPC.orElse(nonePC).getName());
		
		anyPC.ifPresentOrElse(
				
				pc -> System.out.println(pc.getName()),
				 () -> System.out.println("該当がありません"));
		
		System.out.println("------------------------");
		
		Optional<String> names = pcList.stream()
				.map(PC::getName)
				.reduce((a,b) -> a + "," + b);
		
		System.out.println(names.get());
		
		System.out.println("------------------------");
		
		long count = pcList.stream().count();
		
		int sum = pcList.stream()
				.mapToInt(PC::getPrice)
				.sum();
		
		OptionalDouble ave = pcList.stream()
				.mapToInt(PC::getPrice)
				.average();
		
		OptionalInt max = pcList.stream()
				.mapToInt(PC::getPrice)
				.max();
		
		OptionalInt min = pcList.stream()
				.mapToInt(PC::getPrice)
				.min();
		
		System.out.println("件数　= "  + count);
		System.out.println("合計　= "  + sum);
		System.out.println("平均　= "  + ave.getAsDouble());
		System.out.println("最大値　= "  + max.getAsInt());
		System.out.println("最小値　= "  + min.getAsInt());
		
		System.out.println("------------------------");
		Map<String,List<PC>> typeGroup = pcList.stream()
				.collect(groupingBy(PC::getType));
		
		typeGroup.forEach((k,v) -> System.out.println(k + "=" + v));
		
		System.out.println("------------------------");
		
		Map<String,List<String>> typeGroup2 = pcList.stream()
				.collect(groupingBy(PC::getType, mapping(PC::getName,toList())));	
		
		typeGroup2.forEach((k,v) -> System.out.println(k + "=" + v));
		
		System.out.println("------------------------");

		Map<Boolean,List<String>> typeGroup3 = pcList.stream()
				.collect(partitioningBy(pc -> pc.getPrice() > 60000 
				, mapping(PC::getName,toList())));	
		
		typeGroup3.forEach((k,v) -> System.out.println(k + "=" + v));
		
		System.out.println("------------------------");
		
        Set<String> types = pcList.stream()
			   .map(PC::getType)
			   .collect(toSet());
	   
        types.forEach(System.out::println);
        
        System.out.println("------------------------");
        
        Map<String,Integer> pcMap = pcList.stream().collect(toMap(PC::getName, PC::getPrice));
        
        pcMap.forEach((k,v) -> System.out.println(k + "=" + v));
        
        System.out.println("------------------------");
        
        List<Department> list2 = getList2();
        
        String employees = list2.stream()
        		.map(Department :: getEmployees)
        		.flatMap(List::stream)
        		.collect(joining(","));
        
        System.out.println(employees);
        
        System.out.println("------------------------");
        
		int sum1 = pcList.stream()
				.collect(summingInt(PC::getPrice)); 
		
		double ave1 = pcList.stream()
				.collect(averagingInt(PC::getPrice));
		
		Optional<PC> max1 = pcList.stream()
				.collect(maxBy(comparing(PC::getPrice)));
		
		Optional<PC> min1 = pcList.stream()
				.collect(minBy(comparing(PC::getPrice)));
		
		System.out.println("合計= " + sum1);
		System.out.println("平均= " + ave1);
		System.out.println("最大値　= " + max1.get());
		System.out.println("最小値　= " + min1.get());

		System.out.println("------------------------");
		
		IntSummaryStatistics stat = pcList.stream().collect(summarizingInt(PC::getPrice));
		
		System.out.println("件数　= "  + stat.getCount());
		System.out.println("合計　= "  + stat.getSum());
		System.out.println("平均　= "  + stat.getAverage());
		System.out.println("最大値　= "  + stat.getMax());
		System.out.println("最小値　= "  + stat.getMin());
		
	}
	
	public static List<PC> getList(){
		
		List<PC> list = Arrays.asList(
				
				new PC("DEL-2000","DESKTOP", 50000, "DELO"),
				new PC("HQ-110A","DESKTOP", 68000, "HQ"),
				new PC("PanaMini","TABLET", 62000, "Panan"),
				new PC("SenkBook","LAPTOP", 98000, "HQ"),
				new PC("HQ-Star","DESKTOP", 60000, "HQ"),
				new PC("LatteAir","LAPTOP", 85000, "Latte"),
				new PC("Nectop","LAPTOP", 79000, "Nect"),
				new PC("DELOPad","TABLET", 48000, "DELO"),
				new PC("DELO-100","DESKTOP", 48000, "DELO"),
				new PC("Ariban","TABLET", 12000, "Ariban")
				
				);
		
		return list;
		
	}
	
	public static List<Department> getList2(){
		
		List<Department> list = Arrays.asList(
				new Department("総務","テスト１",Arrays.asList("テスト１１","テスト１２","テスト１３")),
				new Department("経理","テスト２",Arrays.asList("テスト２１","テスト２２","テスト２３")),
				new Department("経営","テスト３",Arrays.asList("テスト３１","テスト３２","テスト３３"))
		);
		
		
		return list;
		
	}

}
