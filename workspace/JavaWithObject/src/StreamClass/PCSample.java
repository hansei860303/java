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
				new Department("����","�e�X�g�P",Arrays.asList("�e�X�g�P�P","�e�X�g�P�Q","�e�X�g�P�R")),
				new Department("�o��","�e�X�g�Q",Arrays.asList("�e�X�g�Q�P","�e�X�g�Q�Q","�e�X�g�Q�R")),
				new Department("�o�c","�e�X�g�R",Arrays.asList("�e�X�g�R�P","�e�X�g�R�Q","�e�X�g�R�R"))
		);
		
		
		return list;
		
	}

}
