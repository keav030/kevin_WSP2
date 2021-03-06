package ev01;

import java.util.Scanner;
import java.util.Vector;

import ex09_table.Table;

public class Academic {
	private Vector<AcademicAssignment> aList;
	
	public Academic() {
		aList = new Vector<AcademicAssignment>();
	}
	
	public void addAssignment(AcademicAssignment assignment) {
		aList.add(assignment);
	}
	
	public float getAverage() {
		float sum=0;
		for(int i=0;i<aList.size();i++) {
			AcademicAssignment assignment = aList.elementAt(i);
			sum=sum+assignment.getQualification();
		}
		float average= sum/aList.size();
		return average;
	}
	public void print(){
		Table assigTable = new Table(new int[] {25,15}, new int[] {Table.LEFT, Table.RIGHT},false,
				new String[] {"COURSE","QUALIFICATION"});
		for(int i =0;i<aList.size();i++) {
			AcademicAssignment assignment = aList.elementAt(i);
			String[] row = new String [2];
			row[0]= assignment.getNameAsmt();
			row[1]= ""+assignment.getQualification();
		
			assigTable.addRow(row);
		}
		assigTable.print();
	}
	
	
	public static void main(String[] args) {
		Academic list = new Academic();
		Scanner read = new Scanner(System.in);
		boolean running = false;
		System.out.print("Enter Student Name: ");
		String nameStudent = read.nextLine();
		float average=0;
		while(running==false) {
			System.out.println("----------------------------------------");
			System.out.println("   "+nameStudent);
			System.out.println("----------------------------------------");
			list.print();
			System.out.println("----------------------------------------");
			System.out.println("Average: "+list.getAverage());
			System.out.println("----------------------------------------");
			System.out.println("[A]dd   e[X]it");
			
			String option = read.next();
			if(option.equalsIgnoreCase("X")) {
				running = false;
			}else if(option.equalsIgnoreCase("A")){
				System.out.print("Enter Course Name:          ");
				String name = read.next();
				System.out.print("Enter Course Qualification: ");
				float qualification = read.nextFloat();
				AcademicAssignment assig = new AcademicAssignment(name, qualification);
				list.addAssignment(assig);
				
			}
		}
		
	}
}

