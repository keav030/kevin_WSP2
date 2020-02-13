package ex20_shapes;

import java.util.Scanner;

public class Shape {
	protected String unit;
	
	public double getArea() {
		return 0;
	}
	
	public double getPerimeter() {
		return 0;
		
	}
	
	public Shape(String unit) {
		super();
		this.unit = unit;
	}
	public Shape() {
		System.out.println("Type Unite");
		Scanner read = new Scanner(System.in);
		unit = read.next();
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
}

