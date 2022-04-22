package ExceptionClass;

public class CustomException {

	public static void main(String[] args) {
		
		try {
			method();
		}catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void method() throws MyException{
		throw new MyException("Åöó·äOÇ™î≠ê∂ÇµÇ‹ÇµÇΩ");
	}

}
