package InterfaceClass;

public class CheckType {
	public static void main(String[] args) {
		Member mem = new Member();
		if(mem instanceof Member) {
			System.out.println("Member�^�ł�");
		}
		if(mem instanceof Version) {
			System.out.println("Version�^�ł�");
		}
	}

}
