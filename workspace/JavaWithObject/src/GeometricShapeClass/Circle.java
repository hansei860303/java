package GeometricShapeClass;

public class Circle extends GeomethicShape {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public String getName() {
		return "â~ÅEå`";
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
