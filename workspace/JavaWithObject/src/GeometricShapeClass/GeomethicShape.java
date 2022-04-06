package GeometricShapeClass;

public abstract class GeomethicShape {
	private String color;

	public GeomethicShape(String color) {
		this.color = color;
	}

	public abstract String getName();
	public abstract double area();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
