package ex20_shapes;

public class Triangle extends Shape {
	private int base;
	private int height;

	
	public Triangle(String unit, int base, int height) {
		super(unit);
		this.base = base;
		this.height = height;

	}


	public double getArea() {
		return (base*height)/2;
	}
	
	public double getPerimeter() {
		return Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
