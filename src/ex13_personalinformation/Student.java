package ex13_personalinformation;

import java.util.Scanner;

public class Student extends Person {
	private long code;
	private String program;
	private int semester;
	//---
	public Student(long id, String name, long phone, String adress, int genre, long code, String program,
			int semester) {
		super(id, name, phone, adress, genre);
		this.code = code;
		this.program = program;
		this.semester = semester;
	}
	public Student() {
		super();
		Scanner read = new Scanner(System.in);
		System.out.print("Code:      "); code= read.nextLong();
		System.out.print("Program:   "); program=read.next();
		System.out.print("Semester:  "); semester=read.nextInt();
		
	}
	//---
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	

	

}
