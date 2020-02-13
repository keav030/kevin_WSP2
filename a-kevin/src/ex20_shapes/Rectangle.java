package ex20_shapes;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(String unit, int width, int height) {
		super(unit);
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return (width*2)+(height*2);
	}
	
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
