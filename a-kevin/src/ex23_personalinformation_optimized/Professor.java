package ex23_personalinformation_optimized;

import java.util.Scanner;

public class Professor extends Person {
	private String specialization;

	public Professor(long id, String name, long phone, String adress, int genre, String specialization) {
		super(id, name, phone, adress, genre);
		this.specialization = specialization;
	}
	public Professor() {
		super();
		Scanner read = new Scanner(System.in);
		System.out.print("Specialization: "); specialization=read.next();
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}
