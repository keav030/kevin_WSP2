package ex23_personalinformation_optimized;

import java.util.Scanner;

public class Administrative extends Person {
	private long salary;
	private String job;
	private String office;
	//---
	public Administrative(long id, String name, long phone, String adress, int genre, long salary, String job,
			String office) {
		super(id, name, phone, adress, genre);
		this.salary = salary;
		this.job = job;
		this.office = office;
	}
	public Administrative() {
		super();
		Scanner read = new Scanner(System.in);
		System.out.print("Salary:   "); salary=read.nextLong();
		System.out.print("Job:      "); job=read.next();
		System.out.print("Office:   "); office=read.next();
	}
	//---
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	
	
	
}
