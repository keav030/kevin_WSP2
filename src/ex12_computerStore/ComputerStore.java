package ex12_computerStore;

import java.util.Scanner;
import java.util.Vector;

import ex09_table.Table;

public class ComputerStore {
	Vector <Article>articles;
	private String name;
	
	public ComputerStore(String name) {
		articles=new Vector<Article>();
		this.name=name;
	}
	
	public void addArticle(Article article) {
		articles.add(article);
	}
	
	public Article searchArticle(long code) {
		for(int i=0;i<articles.size();i++) {
			Article article = articles.elementAt(i);
			if(article.getCode()==code) {
				return article;
			}
		}
		return null;
	}
	public void stockReport() {
		Table table1 = new Table(new int[] {6,15,9,7},
				new int[] {Table.LEFT, Table.LEFT, Table.LEFT,Table.RIGHT}, false,
				new String[] {"CODE","NAME","COST","STOCK"});
		for(int i=0;i<articles.size();i++) {
			Article article = articles.elementAt(i);
			String[]row= {""+article.getCode(),""+article.getName(),""+article.getCost(),""+article.getStock()};
			table1.addRow(row);
		}
		table1.print();
	}
	public void articleDetail(Article article) {
		System.out.println("============================");
		System.out.println(" Code: "+article.getCode());
		System.out.println(" Name:   "+article.getName());
		System.out.println(" Cost:   "+article.getCost());
		System.out.println(" Stock:  "+article.getStock());
		System.out.println("============================");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		ComputerStore store1 = new ComputerStore("Store Pro");
		boolean keepRunning=false;
		Scanner read = new Scanner(System.in);
		
		while(keepRunning==false) {
			System.out.println("============================");
			System.out.println("         "+store1.name       );
			System.out.println("============================");
			System.out.println("  1. New Article ");
			System.out.println("  2. Stock Report");
			System.out.println("  3. Article Detail");
			System.out.println("  4. Sale");
			System.out.println("  5. Suply Stock");
			System.out.println("  0. Exit");
			System.out.println("============================");
			int option=read.nextInt();
			switch (option) {
			case 0:
				keepRunning=true;
				break;
			case 1:
				Article article=new Article();
				store1.addArticle(article);
				break;
			case 2:
				store1.stockReport();
				break;
			case 3:
				System.out.print("Article code:    ");
				long code=read.nextLong();
				Article article1 = store1.searchArticle(code);
				if(article1!=null) {
					store1.articleDetail(article1);
				}else {
					System.out.println("There isnt this article");
				}
				break;
			case 4: 
				System.out.print("Article code:    ");
				code=read.nextLong();
				System.out.print("Amount of sale:  ");
				int amount=read.nextInt();
				article1 = store1.searchArticle(code);
				int total=article1.getStock()-amount;
				if(total<0) {
					System.out.println("Error!, There isnt Stock");
				}else {
					article1.setStock(total);
				}
				
				break;
			case 5:
				System.out.print("Article code:    ");
				code=read.nextLong();
				System.out.print("Amount of sale:  ");
				amount=read.nextInt();
				article1 = store1.searchArticle(code);
				article1.setStock(article1.getStock()+amount);
				System.out.println("Stock were increased");
				
				break;
			default:
				break;
			}
		}
		
	}
	
}
