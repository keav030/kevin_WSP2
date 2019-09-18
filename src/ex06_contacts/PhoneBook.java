package ex06_contacts;

import java.util.Scanner;
import java.util.Vector;

public class PhoneBook {
	private Vector<Contact> contactList;
	///////
	public PhoneBook() {
		contactList = new Vector<Contact>();
	}
	
	public void addContact(Contact contact) {
		contactList.add(contact);
	}
	
	public void removeContact(String name) {
		for(int i=0; i<contactList.size();i++) {
			Contact contact = contactList.elementAt(i);//para traer 'contact' de una casilla
			if(contact.getName().equals(name)) {
				contactList.remove(contact);
			}
		}
	}
	
	public void listContacts() {
		for(int i=0; i<contactList.size();i++) {
			Contact contact = contactList.elementAt(i);
			System.out.println("    "+contact.getPhone()+"\t"+contact.getName());		
		}
	}
	
	public int count() {
		return contactList.size();
	}
	
	//================================
	public static void main(String[] args) {
		PhoneBook book = new PhoneBook();
		Scanner read = new Scanner(System.in);
		boolean keepRunning = true;
		
		while(keepRunning == true) {
			//System.out.println("\033[H\33[2J");
			System.out.println("====================================================");
			System.out.println("                     PHONE BOOK                     ");
			System.out.println("====================================================");
			System.out.println("    PHONE		NAME                        ");
			System.out.println("    -------------------------------------------  ");
			book.listContacts();
			System.out.println("    -------------------------------------------  ");
			System.out.println("    "+book.count()+ " contacts");
			System.out.println("====================================================");
			System.out.println("[A]dd contact      [R]emove contact      e[X]it ");
			
			String option = read.next();
			
			if(option.equalsIgnoreCase("X")) {
				keepRunning = false;
			}else if (option.equalsIgnoreCase("A")) {
				System.out.print("Enter the new contact name: ");
				String name = read.next();
				System.out.print("Enter the new contact phone: ");
				long phone = read.nextLong();
				Contact contact = new Contact(name, phone);
				book.addContact(contact);
				System.out.println("                         ");
				System.out.println("                         ");
				System.out.println("                         ");
				
				
			}else if (option.equalsIgnoreCase("R")) {
				System.out.print("Enter the name contact for delete: ");
				String name = read.next();
				book.removeContact(name);
				System.out.println("Contact has been removed");
				System.out.println("                         ");
				System.out.println("                         ");
				System.out.println("                         ");
			}
			 
			
			
		}
		
		
		
	}
	
}
