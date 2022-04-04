package ProductClass;

public class StaticAdder {
	
	private static int number;
	public static void add() {
		number++;
	}
	
	public static void main(String[] args) {
		
		number = 100;
		add();
		add();
		System.out.println("number = " + number);

	}

}
