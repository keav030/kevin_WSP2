package ex12_computerStore;

import java.util.Scanner;

public class Article {
	private long code;
	private String name;
	private long cost;
	private int stock;
	
	
	
	public Article(long code, String name, long cost, int stock) {
		this.code = code;
		this.name = name;
		this.cost = cost;
		this.stock = stock;
	}
	public Article() {
		System.out.println("============================");
		Scanner read = new Scanner(System.in);
		System.out.print("Code:     ");
		this.code=read.nextLong();
		System.out.print("Name:     ");
		this.name=read.next();
		System.out.print("Cost:     ");
		this.cost=read.nextLong();
		System.out.print("Stock:    ");
		this.stock=read.nextInt();
		
	}
	
	public long getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public long getCost() {
		return cost;
	}
	public int getStock() {
		
		return stock;
	}
	public void setStock(int newStock) {
		stock=newStock;
	}
	
	
	
	
}
