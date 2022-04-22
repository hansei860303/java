package ExceptionClass;

public class FinallySample {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
