package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("おはよう");
		list.add("こんにちは");
		list.add("こんばんは");
		for(String ls :list) {
			System.out.println(ls);
		}
		
		List<Member> memberList = new ArrayList<>();
		memberList.add(new Member(101,"テスト101"));
		memberList.add(new Member(102,"テスト102"));
		memberList.add(new Member(103,"テスト103"));
		for(Member m : memberList) {
			System.out.println(m);
		}
		
	}

}
