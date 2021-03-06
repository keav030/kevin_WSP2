package ex15_multimedia;

import java.util.Scanner;

public class Video extends Multimedia {
	//---------------------------------------------------
	//Atributos
	private String duration;
	private long resolution;
	private long fps;
	private boolean closecaption;
	//---------------------------------------------------
	//Constructor
	public Video(long size, String name, String date, String format,String duration, long resolution, long fps, boolean closecaption) {
		super(size, name, date, format);
		this.duration = duration;
		this.resolution = resolution;
		this.fps = fps;
		this.closecaption = closecaption;
	}
	
	public Video() {
		super();
		Scanner key = new Scanner(System.in);
		System.out.println("Duration:        "); duration = key.next();
		System.out.println("Resolution:      "); resolution = key.nextLong();
		System.out.println("Fps:             "); fps = key.nextLong();
		String aux;
		do {
			System.out.println("Closecaption: y/n"); aux = key.next();
		} while (!aux.equalsIgnoreCase("y") && !aux.equalsIgnoreCase("n"));

		if(aux.toLowerCase().contentEquals("y")) {
			closecaption = true;
		} else if (aux.toLowerCase().contentEquals("n")){
			closecaption = false;
		}
		System.out.println("====================================");
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public long getResolution() {
		return resolution;
	}

	public void setResolution(long resolution) {
		this.resolution = resolution;
	}

	public long getFps() {
		return fps;
	}

	public void setFps(long fps) {
		this.fps = fps;
	}

	public boolean isClosecaption() {
		return closecaption;
	}

	public void setClosecaption(boolean closecaption) {
		this.closecaption = closecaption;
	}
	
}
