package ExceptionClass;

public class ExceptionMessage {

	public static void main(String[] args) {
		try {
			method();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void method() throws Exception {
		throw new Exception("š—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");
	}
}
