package ex20_shapes;

public class Circle extends Shape{
	private int radius;

	public Circle(String unit, int radius) {
		super(unit);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*(radius*radius);
	}
	
	public double getPerimeter() {
		return Math.PI*2*radius;
	}
	
}
