package ExceptionClass;

public class ExceptionMessage2 {
	
	public static void main(String[] args) {
		try {
			foo();
		}catch(Exception e) {
			System.out.println("main:����O���������܂���");
		}
	}
	
	public static void foo() throws Exception {
		bar();
	}
	
	public static void bar() throws Exception {
		throw new Exception();
	}
}
