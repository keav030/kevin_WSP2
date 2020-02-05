package ex19_multimedia;

import java.util.Scanner;

public class Multimedia {
	//-------------------------------------------
	protected	long	size;
	protected	String	name;
	protected	String	date;
	protected	String	format;
	//-------------------------------------------
	public Multimedia(long size, String name, String date, String format) {
		super();
		this.size = size;
		this.name = name;
		this.date = date;
		this.format = format;
	}
	//-------------------------------------------
	public Multimedia() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Size:    ");	size	= scan.nextLong();
		System.out.print("Name:    ");	name	= scan.next();
		System.out.print("Date:    ");	date	= scan.next();
		System.out.print("Format:  ");	format	= scan.next();
	}
	//-------------------------------------------
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	//-------------------------------------------
	public void print() {
		System.out.println("Size:         " + size);
		System.out.println("Name:         " + name);
		System.out.println("Date:         " + date);
		System.out.println("Format:       " + format);
	}
}
