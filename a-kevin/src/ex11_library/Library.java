package ex11_library;

import java.util.Scanner;
import java.util.Vector;

import ex09_table.Table;

public class Library {
	private String name;
	Vector<Book>books;
	//--------
	public Library(String name) {
		this.name=name;
		this.books= new Vector<Book>();
	}
	//----
	public void addBook() {
		books.add(new Book());

	}
	//----
	public Book searchBook(long code) {
		Book found = null;
		for(int i=0;i<books.size();i++) {
			Book book= books.elementAt(i);
			if(code == book.getCode()) {
				found = book;
				break;
			}
		}
		return found;
	}
	//----
	public void report() {
		Table table = new Table(new int[] {7,30,10},
				new int[] {Table.LEFT,Table.LEFT,Table.LEFT}, true,
				new String[] {"CODE","TITLE","STATE"});
		for(int i=0;i<books.size();i++) {
			Book book= books.elementAt(i);
			table.addRow(new String[] {""+book.getCode(), ""+book.getTitle(), book.isAvailable()?"Available":"Lended"});
			
		}
		table.print();
	}

	
	public static void main(String[] args) {
		Library lib = new Library("Alberto Quijano");
		boolean keep=true;
		while(keep) {
			System.out.println("========================================");
			System.out.println("  Library:   "+ lib.name);
			System.out.println("========================================");
			System.out.println("   1. Add Book");
			System.out.println("   2. Search Book");
			System.out.println("   3. Lend Book");
			System.out.println("   4. Return Book");
			System.out.println("   5. Report");
			System.out.println("   0. Exit");
			System.out.println("========================================");
			System.out.print("What is your option?:  ");
			Scanner read = new Scanner(System.in);
			int option = read.nextInt();
			switch (option) {
			case 0:keep=false;
				break;
			case 1:lib.addBook();
				break;
			case 2: System.out.print("Join book code: ");
					long code= read.nextLong();
					Book book = lib.searchBook(code);
					if(book != null) {
						book.printCard();
					}else {
						System.out.println("Error, This book does not exist");
					}
				break;	
			case 3: System.out.print("Join book code: ");
					code= read.nextLong();
					book = lib.searchBook(code);
					if(book != null) {
						book.lend();
					}else {
						System.out.println("Error, This book does not exist");
					}
				break;	
			case 4: System.out.print("Join book code: ");
					code= read.nextLong();
					book = lib.searchBook(code);
					if(book != null) {
						book.restore();
					}else {
						System.out.println("Error, This book does not exist");
					}
				break;		
			case 5: lib.report();
				break;
			
			}
		}
	}
}
