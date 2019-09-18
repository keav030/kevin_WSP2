package ex06_contacts;

public class Contact {
	private String name;
	private long phone;
	
	public Contact (String name, long phone) {
		this.name = name;
		this.phone = phone;
		
	}
	//////////////////////////
	public String getName() {
		return name;
	}
	
	public long getPhone() {
		return phone;
		
	}
	//////////////////////////
}
