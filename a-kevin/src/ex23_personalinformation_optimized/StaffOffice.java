package ex23_personalinformation_optimized;

import java.util.Scanner;
import java.util.Vector;

import ex09_table.Table;

public class StaffOffice {
	private Vector<Person>persons;
	
	public StaffOffice() {
		persons=new Vector<Person>();
	}
	
	public void addStudent() {
		persons.add(new Student());
	}
	public void addProfessor() {
		persons.add(new Professor());
	}
	public void addAdministrative() {
		persons.add(new Administrative());
	}
	public void generalReport() {
		Table tableS = new Table(new int[] {20,20,20},new int[] {Table.LEFT, Table.LEFT, Table.LEFT}, true, new String[] {"Staff Office","Id","Ocupation(?"});
		for(int i=0;i<persons.size();i++) {
			Person prs = persons.elementAt(i);
			String[]row = {""+prs.getName(),""+prs.getId(), prs.getClass().getSimpleName()};
			tableS.addRow(row);
		}
		System.out.println("====================================");
		System.out.println("");
		tableS.print();
		
	}
	public Person searchPerson(long id) {
		for(int i=0; i<persons.size();i++) {
			Person prs = persons.elementAt(i);
			if( prs.getId()==id) {
				return prs;
			}
		}
		return null;
	}
	public void removePerson(Person person) {
		persons.remove(person);
	}
	
	//---
	public static void main(String[] args) {
		StaffOffice sOffice = new StaffOffice();
		boolean keep=true;
		while(keep) {
			System.out.println("====================================");
			System.out.println("            STAFF OFFICE");
			System.out.println("====================================");
			System.out.println("   1. Add Student");
			System.out.println("   2. Add Professor");
			System.out.println("   3. Add Administrative");
			System.out.println("   4. General Report");
			System.out.println("   5. Remove Person");
			System.out.println("   0. Exit");
			Scanner read = new Scanner(System.in);
			int option= read.nextInt();
			switch (option) {
			case 1:
				sOffice.addStudent();
				break;
			case 2:
				sOffice.addProfessor();
				break;
			case 3:
				sOffice.addAdministrative();
				break;
			case 4:
				sOffice.generalReport();
				break;
			case 5:
				System.out.print("Id Student: "); int ids=read.nextInt();
				Person psaux = sOffice.searchPerson(ids);
				if(psaux!=null) {
					sOffice.removePerson(psaux);
				}else {
					System.out.println("The student do not exist");
				}
				
				
				break;
			case 0:
				keep=false;
				break;
			}
		}
	}
}
