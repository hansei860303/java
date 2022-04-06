package PolymorphismClass;

public class PolymorphismDemo {
	
	public static void main(String[] args) {
		Foo foo =new Bar();
		foo.show();
		foo=new Baz();
		foo.show();
		
		Bar bar = new Bar();
		Baz baz = new Baz();
		useAny(bar);
		useAny(baz);
		
	}
	
	public static void useAny(Foo foo) {
		foo.show();
	}
}
