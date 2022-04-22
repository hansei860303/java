package Interface2Class;

interface A{
	void talk();
}

interface B {
	void hello();
}

interface C extends A,B{
	void bye();
}

public class Xsample implements C {

	@Override
	public void talk() {
		System.out.println("talk");
		
	}

	@Override
	public void hello() {
		System.out.println("hello");
		
	}

	@Override
	public void bye() {
		System.out.println("bye");
		
	}
	
}
