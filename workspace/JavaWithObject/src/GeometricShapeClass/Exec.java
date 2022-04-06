package GeometricShapeClass;

public class Exec {

	public static void main(String[] args) {
		
		String color ="red";
		double radius = 10;
		
		Circle circle = new Circle(color, radius);
		
		System.out.println(circle.getName());
		System.out.println(circle.getColor());
		System.out.println(circle.area());
		
	}

}
