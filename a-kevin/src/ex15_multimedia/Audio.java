package ex15_multimedia;

import java.util.Scanner;

public class Audio extends Multimedia{
	//---------------------------------------------------
	//Atributos
	private String duration;
	private String interpret;
	private int    compretion;
	//---------------------------------------------------
	//Constructor
	public Audio() {
		super();
		Scanner key = new Scanner(System.in);
		System.out.println("Duration:       "); duration = key.next();
		System.out.println("Interpret:      "); interpret = key.next();
		System.out.println("Compretion: kb/s"); compretion = key.nextInt();
		System.out.println("====================================");
	}
	//---------------------------------------------------
	//Constructor con parametros
	public Audio(long size, String name, String date, String format, String duration, String interpret,
			int compretion) {
		super(size, name, date, format);
		this.duration = duration;
		this.interpret = interpret;
		this.compretion = compretion;
	}
	//---------------------------------------------------
	//Getters and Setters
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getInterpret() {
		return interpret;
	}
	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}
	public int getCompretion() {
		return compretion;
	}
	public void setCompretion(int compretion) {
		this.compretion = compretion;
	}
	
}

