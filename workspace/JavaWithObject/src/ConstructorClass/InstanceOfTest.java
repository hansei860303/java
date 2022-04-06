package ConstructorClass;

public class InstanceOfTest {
	
	public static void main(String[] args) {
		
		ClassA obj1 = new ClassA();
		ClassB obj2 = new ClassB();
		ClassC obj3 = new ClassC();
		
		System.out.println(obj1 instanceof ClassB);
		System.out.println(obj2 instanceof ClassB);
		System.out.println(obj3 instanceof ClassB);
	}

}
