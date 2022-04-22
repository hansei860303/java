package InterfaceClass;

class Foo implements Version{
	@Override
	public String getVersion() {
		return "Foo version 1.0";
	}
}

class Bar1 implements Version{
	@Override
	public String getVersion() {
		return "Bar1 version 2.5";
	}
}


public class Polymorphism {
	
	public static void main(String[] args) {
		Foo foo = new Foo();
		Bar bar = new Bar();
		display(foo);
		display(bar);
		
	}
	
	public static void display(Version ver) {
		System.out.println(ver.getVersion());
	}

}
