package ExceptionClass;

public class ExceptionSample {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		
		try {
			int ans = div(a,b);
			System.out.println(a + "/" + b + "=" + ans);
		}
		catch(ArithmeticException e) {
			System.out.println("0‚ÅŠ„‚éŒvŽZ‚Í‚Å‚«‚È‚¢");
		}
		
		System.out.print("..end...");
		
	}
	
	public static int div(int a,int b) {
		
		if(b==0 ) {
			throw new ArithmeticException();
		}
		return a/b;
	}

}
