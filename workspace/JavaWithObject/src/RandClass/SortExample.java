package RandClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Interface2Class.Member;

public class SortExample {

	public static void main(String[] args) {
		
		System.out.println("サンプル1");
		List<Member> list1 = Arrays.asList(new Member(115, "test3"), 
				new Member(120, "test5"), new Member(108, "test1"),
				new Member(105, "test4"), new Member(112, "test2"));
		list1.sort(new Comparator<Member>() {
			public int compare(Member o1, Member o2) {
		        String s1=o1.getName(),s2 = o2.getName();
				return s1.compareTo(s2);
			}
			
		});
		
		for(Member m1:list1) {
			System.out.println(m1);
		}	
		
		System.out.println("サンプル2");
		List<Member> list = Arrays.asList(new Member(115, "test3"), 
				new Member(120, "test5"), new Member(108, "test1"),
				new Member(105, "test4"), new Member(112, "test2"));
		list.sort((o1,o2)-> o1.getName().compareTo(o2.getName()) );
		for(Member m:list) {
			System.out.println(m);
		}
		
	}

}
