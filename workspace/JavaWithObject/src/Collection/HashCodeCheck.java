package Collection;

public class HashCodeCheck {

	public static void main(String[] args) {
		Member member1 = new Member(1, "メンバー１");
		Member member2 = new Member(1, "メンバー2");
		Member member3 = new Member(3, "メンバー3");
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
	}

}
