package StreamClass;

public class PC {

	private String name;
	private String type;
	private int price;
	private String maker;
	
	public PC(String name, String type, int price, String maker) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.maker = maker;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	public String getMaker() {
		return maker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "PC [name=" + name + ", type=" + type + ", price=" + price + ", maker=" + maker + "]";
	}	

}
