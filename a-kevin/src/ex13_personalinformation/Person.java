package ex13_personalinformation;

import java.util.Scanner;

public class Person {
	public static final int MALE = 1;
	public static final int FEMALE=2;
	
	protected long id;
	protected String name;
	protected long phone;
	protected String adress;
	protected int genre;
	
	public Person(long id, String name, long phone, String adress, int genre) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.adress = adress;
		this.genre = genre;
	}
	public Person() {
		Scanner read = new Scanner(System.in);
		System.out.print("Id:      "); id = read.nextLong();
		System.out.print("Name:    "); name = read.next();
		System.out.print("Phone:   "); phone = read.nextLong();
		System.out.print("Address: "); adress = read.next();
		System.out.print("Genere [1=Male / 2=Female]: "); genre = read.nextInt();
	}
	//---
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public static int getMale() {
		return MALE;
	}

	public static int getFemale() {
		return FEMALE;
	}
	
	
	
	
}
