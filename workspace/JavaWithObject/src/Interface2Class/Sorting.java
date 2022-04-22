package Interface2Class;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		Member member[] = {
				new Member(115,"“c’†"),
				new Member(120,"–Ø‘º"),
				new Member(108,"²“¡"),
				new Member(112,"—é–Ø"),
				new Member(105,"R‰º")
		};
		
		Arrays.sort(member);
		for(Member m : member) {
			System.out.println(m);
		}

	}

}
