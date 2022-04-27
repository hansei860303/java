package StringClass;

public enum Color {
	WHITE("test1"),
	BLACK("test2"),
	GOLD("test3");
	
	
	private String ModelNumber;
	private Color(String ModelNumber) {
		this.ModelNumber = ModelNumber;
	}
	
	public String getModelNumber() {
		return ModelNumber;
	}
}
