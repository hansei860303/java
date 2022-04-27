package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		//�z�񃊃X�g
		List<Member> list = Arrays.asList(new Member(102,"�e�X�g102"),
				                          new Member(103,"�e�X�g103"),
				                          new Member(101,"�e�X�g101"));
		
		Collections.sort(list);
		
		
		System.out.println("�\�[�g���P");
		for(Member m : list) {
			System.out.println(m);
		}
		
		System.out.println("�\�[�g���Q");
		list.sort(Comparator.reverseOrder());
		
		for(Member m : list) {
			System.out.println(m);
		}		
		
		//�s�σ��X�g
		String[] names = {"�c��","���","�ؑ�"};
		List<String> list1 = List.of(names);
		
		try {
			list1.add("�R�c");
		}catch(RuntimeException e) {
			System.out.println("list �͕ύX�ł��܂���");
		}
		
	}

}
