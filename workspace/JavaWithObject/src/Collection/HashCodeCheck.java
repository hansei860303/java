package Collection;

public class HashCodeCheck {

	public static void main(String[] args) {
		Member member1 = new Member(1, "�����o�[�P");
		Member member2 = new Member(1, "�����o�[2");
		Member member3 = new Member(3, "�����o�[3");
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
	}

}
