package ExceptionClass;

public class ThrowException {

	public static void main(String[] args) {
		try {
			sub();
		}catch (Exception e) {
			System.out.println("����O���������܂���");
		}
	}
	
	public static void sub() throws Exception{
		throw new Exception();
	}

}
