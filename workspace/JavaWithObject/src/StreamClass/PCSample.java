package StreamClass;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;

public class PCSample {

	public static void main(String[] args) {
		
		List<PC> list = getList();
		
		list.stream().filter(pc -> "Panan".equals(pc.getMaker()))
		.forEach(System.out::println);
		
		
		  List<PC> mark_panan = list.stream() .filter(pc ->
		  "Panan".equals(pc.getMaker())) .collect(toList());
		  mark_panan.forEach(System.out::println);
		  
		  List<String> pcMakers = list.stream().map(PC::getMaker)
				                  .collect(toList());
		  
		  pcMakers.forEach(name -> System.out.print(name + " "));
		  
		  System.out.println();
		  
		  List<String> makers = list.stream().map(PC::getMaker)
				  .distinct()
                  .collect(toList());
		  
		  makers.forEach(name -> System.out.print(name + " "));
		  
		  System.out.println("------------------------");
		  
		  List<PC> sortedPCs = list.stream()
				  .sorted(comparing(PC::getPrice))
				  .collect(toList());
		  
		  sortedPCs.forEach(System.out :: println);
		  
		  System.out.println("------------------------");
		  
		  List<PC> limitedPCs = list.stream()
				  .sorted(comparing(PC::getPrice))
				  .skip(3)
				  .limit(3)
				  .collect(toList());
		  
		  limitedPCs.forEach(System.out :: println);
		  
		  System.out.println("------------------------");
		  
		  List<Department> list2 = getList2();
		  
		  List<String> employees = list2.stream()
				  .map(Department::getEmployees)
				  .flatMap(List::stream)
				  .collect(toList());
		  
		  employees.forEach(e -> System.out.print(e + " "));
		  
		  
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
