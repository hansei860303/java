package RandClass;

import java.util.Arrays;
import java.util.List;

import Interface2Class.Member;

public class SortExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member(115, "test1"), 
				new Member(120, "test2"), new Member(108, "test3"),
				new Member(105, "test4"), new Member(112, "test5"));
		list.sort((o1,o2)-> o1.getName().compareTo(o2.getName()) );
		for(Member m:list) {
			System.out.println(m);
		}
	}

}
