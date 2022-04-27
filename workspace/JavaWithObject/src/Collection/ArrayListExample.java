package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("���͂悤");
		list.add("����ɂ���");
		list.add("����΂��");
		for(String ls :list) {
			System.out.println(ls);
		}
		
		List<Member> memberList = new ArrayList<>();
		memberList.add(new Member(101,"�e�X�g101"));
		memberList.add(new Member(102,"�e�X�g102"));
		memberList.add(new Member(103,"�e�X�g103"));
		for(Member m : memberList) {
			System.out.println(m);
		}
		
	}

}
