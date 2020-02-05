package ex19_multimedia;

import java.util.Scanner;

public class Image extends Multimedia {
	//-------------------------------------------
	private	int		width;
	private	int		height;
	private	boolean	transparent;
	//-------------------------------------------
	public Image(long size, String name, String date, String format, int width, int height, boolean transparent) {
		super(size, name, date, format);
		this.width = width;
		this.height = height;
		this.transparent = transparent;
	}
	//-------------------------------------------
	public Image() {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.print("Width:             ");	width		= scan.nextInt();
		System.out.print("Height:            ");	height		= scan.nextInt();
		
		String answer;
		do {
			System.out.print("Transparent (y/n): ");	answer	= scan.next();
		} while ( !answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n") );

		if (answer.equalsIgnoreCase("y")) {
			transparent = true;
		} else if (answer.equalsIgnoreCase("n")) {
			transparent = false;
		}
	}
	//-------------------------------------------
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
	public boolean isTransparent() {
		return transparent;
	}
	public void setTransparent(boolean transparent) {
		this.transparent = transparent;
	}
	//-------------------------------------------
	public void print() {
		super.print();
		System.out.println("Width:        " + width);
		System.out.println("Height:       " + height);
		System.out.println("Transparent:  " + transparent);
	}
}
