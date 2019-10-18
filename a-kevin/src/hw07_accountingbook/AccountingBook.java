package hw07_accountingbook;

import java.util.Scanner;
import java.util.Vector;

import ex09_table.Table;


public class AccountingBook {
	private Vector<Item> itemList;
	private int balance;
	
	public AccountingBook() {
		itemList= new Vector<Item>();
	}
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public void print() {
		Table itemTable = new Table(new int[] {25,10,10}, new int[] {Table.LEFT,Table.RIGHT,Table.RIGHT},
				true, new String[] {"DETAIL","VALUE","BALANCE"} );
		
		for(int i=0;i<itemList.size();i++) {
			Item itemAux = itemList.elementAt(i);
			String[] row = new String[3];
			row[0]=itemAux.getDeatail();
			row[1]=""+itemAux.getValue();
			row[2]=""+itemAux.getBalance();
			itemTable.addRow(row);
		}
		itemTable.print();
		System.out.println("[A]dd   e[X]it");
		System.out.println("-------------------------------------------------");

	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	//=========================
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		AccountingBook aBook = new AccountingBook();
		System.out.print("Initial balance: ");
		int initialBalance=read.nextInt();
		aBook.setBalance(initialBalance);
		boolean running=true;
		
		while(running==true){
			aBook.print();
			String selOption = read.next();
			if(selOption.equalsIgnoreCase("X")) {
				running = false;
			}else if(selOption.equalsIgnoreCase("A")) {
				System.out.print("Enter item detail: ");
				String detail = read.next();
				System.out.print("Enter item value: ");
				int value=read.nextInt();
				aBook.setBalance(initialBalance-value);
				initialBalance=initialBalance-value;
				Item itemN = new Item(detail, value,initialBalance);
				aBook.addItem(itemN);
			}
				
		}
		
	}
}
