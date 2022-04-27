package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		//配列リスト
		List<Member> list = Arrays.asList(new Member(102,"テスト102"),
				                          new Member(103,"テスト103"),
				                          new Member(101,"テスト101"));
		
		Collections.sort(list);
		
		
		System.out.println("ソート順１");
		for(Member m : list) {
			System.out.println(m);
		}
		
		System.out.println("ソート順２");
		list.sort(Comparator.reverseOrder());
		
		for(Member m : list) {
			System.out.println(m);
		}		
		
		//不変リスト
		String[] names = {"田中","鈴木","木村"};
		List<String> list1 = List.of(names);
		
		try {
			list1.add("山田");
		}catch(RuntimeException e) {
			System.out.println("list は変更できません");
		}
		
	}

}
