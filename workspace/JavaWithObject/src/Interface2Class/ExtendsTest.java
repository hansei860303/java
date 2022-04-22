package Interface2Class;


class Y extends Xsample {
	
	@Override
	public void hello() {
		System.out.println("‚±‚É‚¿‚Í");
	}
}

public class ExtendsTest {

	public static void main(String[] args) {
		Y y = new Y();
		y.talk();
		y.hello();
		y.bye();
	}

}
