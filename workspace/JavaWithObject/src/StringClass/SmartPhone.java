package StringClass;

public class SmartPhone {
	
	int type;
	Color color;
	
	public SmartPhone(int type, Color color) {
		this.type = type;
		this.color = color;
	}

	public int getType() {
		return type;
	}

	public Color getColor() {
		return color;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "SmartPhone [type=" + type + ", color=" + color + "]";
	}

}
