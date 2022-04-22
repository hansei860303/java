package ExceptionClass;

public class MyException extends Exception {
	private static final long serialVersionUID = 28L;
	
	public MyException(String msg) {
		super(msg);
	}
	
	public MyException() {}
}
