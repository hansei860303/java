package RandClass;

public class FooSample1 {

	public static void main(String[] args) {
		Foo<String> foo = new Foo<>("Hello");
		String msg = foo.getObj();
		
		System.out.println(msg);

	}
}
