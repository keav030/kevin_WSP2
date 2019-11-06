package ex14_pcinformation;

import java.util.Scanner;

public class HardwareInfo extends ComputerInfo {
	private int weigth;
	private String type;
	//----
	public HardwareInfo(long code, String name, String manufacturer, boolean state, int weigth, String type) {
		super(code, name, manufacturer, state);
		this.weigth = weigth;
		this.type = type;
	}
	public HardwareInfo() {
		super();
		Scanner read = new Scanner(System.in);
		System.out.print("Weigth:         "); weigth=read.nextInt();
		System.out.print("Type:         "); type=read.next();
	}
	//---
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
