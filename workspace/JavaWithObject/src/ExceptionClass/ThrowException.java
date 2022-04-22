package ExceptionClass;

public class ThrowException {

	public static void main(String[] args) {
		try {
			sub();
		}catch (Exception e) {
			System.out.println("š—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
		}
	}
	
	public static void sub() throws Exception{
		throw new Exception();
	}

}
