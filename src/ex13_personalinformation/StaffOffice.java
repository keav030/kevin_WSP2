package ex13_personalinformation;

import java.util.Scanner;
import java.util.Vector;

import ex09_table.Table;

public class StaffOffice {
	private Vector<Student>students;
	private Vector<Professor>professors;
	private Vector<Administrative>admins;
	
	public StaffOffice() {
		students = new Vector<Student>();
		professors = new Vector<Professor>();
		admins = new Vector<Administrative>();
	}
	
	public void addStudent() {
		students.add(new Student());
	}
	public void addProfessor() {
		professors.add(new Professor());
	}
	public void addAdministrative() {
		admins.add(new Administrative());
	}
	public void generalReport() {
		Table tableS = new Table(new int[] {20,20},new int[] {Table.LEFT, Table.LEFT}, true, new String[] {"Student","Id"});
		for(int i=0;i<students.size();i++) {
			Student stn = students.elementAt(i);
			String[]row = {""+stn.name,""+stn.id};
			tableS.addRow(row);
		}
		System.out.println("===========================================");
		System.out.println("");
		tableS.print();
		//table professor down
		Table tableP = new Table(new int[] {20,20},new int[] {Table.LEFT, Table.LEFT}, true, new String[] {"Profesor","Id"});
		for(int i=0;i<professors.size();i++) {
			Professor pfs = professors.elementAt(i);
			String[]row = {""+pfs.name,""+pfs.id};
			tableP.addRow(row);
		}
		tableP.print();
		//table admin down
		Table tableA = new Table(new int[] {20,20},new int[] {Table.LEFT, Table.LEFT}, true, new String[] {"Administrative","Id"});
		for(int i=0;i<admins.size();i++) {
			Administrative adm = admins.elementAt(i);
			String[]row = {""+adm.name,""+adm.id};
			tableA.addRow(row);
		}
		tableA.print();
	}
	public Student searchStudent(long id) {
		for(int i=0; i<students.size();i++) {
			Student student = students.elementAt(i);
			if( student.getId()==id) {
				return student;
			}
		}
		return null;
	}
	public Professor searchProfessor(long id) {
		for(int i=0; i<professors.size();i++) {
			Professor profesor = professors.elementAt(i);
			if( profesor.getId()==id) {
				return profesor;
			}
		}
		return null;
	}
	public Administrative searchAdmin(long id) {
		for(int i=0; i<admins.size();i++) {
			Administrative admin = admins.elementAt(i);
			if( admin.getId()==id) {
				return admin;
			}
		}
		return null;
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}
	public void removeProfessor(Professor professor) {
		professors.remove(professor);
	}
	public void removeAdmin(Administrative admin) {
		admins.remove(admin);
	}
	
	//=================
	//=================
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
			System.out.println("   5. Remove Student");
			System.out.println("   6. Remove Professor");
			System.out.println("   7. Remove Administrative");
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
				Student staux = sOffice.searchStudent(ids);
				if(staux!=null) {
					sOffice.removeStudent(staux);
				}else {
					System.out.println("The student do not exist");
				}
				break;
				
			case 6:
				System.out.print("Id Professor: "); ids=read.nextInt();
				Professor profeaux = sOffice.searchProfessor(ids);
				if(profeaux!=null) {
					sOffice.removeProfessor(profeaux);
				}else {
					System.out.println("The Professor do not exist");
				}
				break;
			case 7:
				System.out.print("Id Administrative: "); ids=read.nextInt();
				Administrative adminaux = sOffice.searchAdmin(ids);
				if(adminaux!=null) {
					sOffice.removeAdmin(adminaux);
				}else {
					System.out.println("The Administrative do not exist");
				}
				break;
			case 0:
				keep=false;
				break;
			}
		}
	}
}