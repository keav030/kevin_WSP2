package hw07_accountingbook;

public class Item {
	private String detail;
	private int value;
	private int balance;
	
	public Item(String detail, int value, int balance){
		this.detail=detail;
		this.value=value;
		this.balance=balance;
	}
	
	public String getDeatail() {
		return this.detail;
	}
	public int getValue() {
		return this.value;
	}
	
	public int getBalance() {
		return this.balance;
	}
}
