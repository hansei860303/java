package Interface2Class;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		Member member[] = {
				new Member(115,"�c��"),
				new Member(120,"�ؑ�"),
				new Member(108,"����"),
				new Member(112,"���"),
				new Member(105,"�R��")
		};
		
		Arrays.sort(member);
		for(Member m : member) {
			System.out.println(m);
		}

	}

}
