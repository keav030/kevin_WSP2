package ex19_multimedia;

import java.util.Scanner;

public class Video extends Multimedia {
	//-------------------------------------------
	private	String	resolution;
	private	int		duration;	//minutes
	//-------------------------------------------
	public Video(long size, String name, String date, String format, String resolution, int duration) {
		super(size, name, date, format);
		this.resolution = resolution;
		this.duration = duration;
	}
	//-------------------------------------------
	public Video() {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.print("Resolution:     ");	resolution	= scan.next();
		System.out.print("Duration:       ");	duration	= scan.nextInt();
	}
	//-------------------------------------------
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	//-------------------------------------------
	public void print() {
		super.print();
		System.out.println("Resolution:   " + resolution);
		System.out.println("Duration:     " + duration + " minutes");
	}
	
}
