package ex14_pcinformation;

import java.util.Scanner;

public class SoftwareInfo extends ComputerInfo{
	private String version;
	private String licence;
	private String term;
	//---------
	public SoftwareInfo(long code, String name, String manufacturer, boolean state, String version, String licence,
			String term) {
		super(code, name, manufacturer, state);
		this.version = version;
		this.licence = licence;
		this.term = term;
	}
	public SoftwareInfo() {
		super();
		Scanner read = new Scanner(System.in);
		System.out.print("Code:         "); version=read.next();
		System.out.print("Name:         "); licence=read.next();
		System.out.print("Term:         "); term=read.next();
	}
	//----
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	
	
	
}
