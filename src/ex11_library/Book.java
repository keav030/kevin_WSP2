package ex11_library;

import java.util.Scanner;

public class Book {
	private long code;
	private String title;
	private String author;
	private String topic;
	private String editorial;
	private boolean available;
	
	public Book() {
		System.out.println("==============================");
		System.out.println("         BOOK REGISTER        ");
		System.out.println("==============================");
		Scanner read = new Scanner(System.in);
		System.out.print("Code:        "); code= read.nextLong();
		System.out.print("Title:       "); title= read.next();
		System.out.print("Author:      "); author= read.next();
		System.out.print("Topic:       "); topic= read.next();
		System.out.print("Editorial:   "); editorial= read.next();
		available = true;
	}
	
	
	public Book(long code, String title, String author, String topic, String editorial) {
		this.code = code;
		this.title = title;
		this.author = author;
		this.topic = topic;
		this.editorial = editorial;
		this.available=true;
	}
	//---
	public void printCard() {
		System.out.println("==============================");
		System.out.println("           BOOK CARD          ");
		System.out.println("==============================");
		System.out.println("  Code:        "+code);
		System.out.println("  Title:       "+title);
		System.out.println("  Author:      "+author);
		System.out.println("  Topic:       "+topic);
		System.out.println("  Editorial:   "+editorial);
		System.out.println("  State:       "+(available?"Available":"Lended"));
	}
	//-----
	public void lend() {
		if(available) {
			available=false;
			System.out.println("-]This book is lended now");
		}else { 
			System.out.println("-]Error, This book isn't available");
		}
	}
	//------
	public void restore() {
		if(!available) {
			available=true;
			System.out.println("-]The book has been return now");
		}else {
			System.out.println("-]Error This book wasen't lended");
		}
	}


	public long getCode() {
		return code;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public String getTopic() {
		return topic;
	}


	public String getEditorial() {
		return editorial;
	}


	public boolean isAvailable() {
		return available;
	}
	
	
	
}
