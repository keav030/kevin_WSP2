package ex15_multimedia;

import java.util.Scanner;

public class Image extends Multimedia {
	//---------------------------------------------------
	//Atributos
	private int width; 
	private int height;
	private boolean transparent;
	//---------------------------------------------------
	//Constructor
	public Image() {
		super();
		Scanner key = new Scanner(System.in);
		
		System.out.println("Width:         "); width = key.nextInt();
		System.out.println("Height:        "); height = key.nextInt();
		
		String aux;
		do {
			System.out.println("Transparet: y/n"); aux = key.next();
		} while (!aux.equalsIgnoreCase("y") && !aux.equalsIgnoreCase("n"));

		if(aux.toLowerCase().contentEquals("y")) {
			transparent = true;
		} else if (aux.toLowerCase().contentEquals("n")){
			transparent = false;
		}
		
		System.out.println("====================================");
	}
	//--------------------------------------------------- 
	//Constructor con parametros
	public Image(long size, String name, String date, String format, int width, int height, boolean transparent) {
		super(size, name, date, format);
		this.width = width;
		this.height = height;
		this.transparent = transparent;
	}
	//---------------------------------------------------
	//Getters and Setters
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
	
	
	
	
}

