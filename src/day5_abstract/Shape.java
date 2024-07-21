package day5_abstract;

public abstract class Shape {
	
	private String color = "red";

	public String getColor() {
		return color;
	}

// không cần hàm setter
	public  abstract void draw();
}
