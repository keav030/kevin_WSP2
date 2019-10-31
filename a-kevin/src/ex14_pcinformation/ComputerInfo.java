package ex14_pcinformation;

import java.util.Scanner;

public class ComputerInfo {
	public static final int OK=1;
	public static final int FAILED=2;
	private long code;
	private String name;
	private String manufacturer;
	private boolean state;
	//----
	public ComputerInfo(long code, String name, String manufacturer, boolean state) {
		super();
		this.code = code;
		this.name = name;
		this.manufacturer = manufacturer;
		this.state = state;
	}
	public ComputerInfo() {
		Scanner read = new Scanner(System.in);
		System.out.print("Code:         "); code=read.nextLong();
		System.out.print("Name:         "); name=read.next();
		System.out.print("Manufacturer: "); manufacturer=read.next();
		System.out.print("State [1 = ok / 2 = failed]: "); int st=read.nextInt();
		if(st==1) {
			state=true;
		}else {
			state=false;
		}	
	}
	//----
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
}
