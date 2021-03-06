package ex09_table;

import java.util.Vector;

public class Table {
	public static int LEFT = 1;
	public static int RIGHT = 2;
	public static int CENTER = 3;
	
	
	private int[] spaces;
	private Vector<String[]> data;
	private int[] alignments;
	private boolean printBorders;
	private String[] title;
	//===========================
	public Table(int[] spaces) {
		this.spaces = spaces;
		this.alignments = null;
		this.data   = new Vector<String[]>();
		this.printBorders= false;
		this.title = null;
	}
	public Table(int[] spaces, int[] alignments) {
		this.spaces = spaces;
		this.alignments = alignments;
		this.data   = new Vector<String[]>();
		this.printBorders= false;
		this.title = null;
	}
	public Table(int[] spaces, int[] alignments, boolean printBorders) {
		this.spaces = spaces;
		this.alignments = alignments;
		this.data   = new Vector<String[]>();
		this.printBorders= printBorders;
		this.title = null;
	}
	public Table(int[] spaces, int[] alignments, boolean printBorders, String[] title) {
		this.spaces = spaces;
		this.alignments = alignments;
		this.data   = new Vector<String[]>();
		this.printBorders= printBorders;
		this.title = title;
	}
	//==========================
	public void addRow(String[] row) {
		data.add(row);
	}
	
	private void gap(int length) {
		for(int i=0;i<length;i++) {
			System.out.print(" ");
		}
	}
	private void printLine() {
		for(int c=0;c<spaces.length;c++) {
			System.out.print("+");
			for(int i=0;i<spaces[c];i++) {
				System.out.print("-");
			}
		}
		System.out.println("+");
		
	}

	
	public void print() {
		int cols = spaces.length;
		//=========================
		if(title!=null) {
			if(printBorders==true) {printLine();} 
			for(int c=0;c<title.length;c++) {
				if(printBorders==true) {System.out.print("|");}
				if(alignments == null || alignments[c]== LEFT) {
					System.out.print(title[c]);
					gap(spaces[c] - title[c].length());
				}else if(alignments[c]== RIGHT) {
					gap(spaces[c] - title[c].length());
					System.out.print(title[c]);	
				}else if(alignments[c]== CENTER) {
					gap((spaces[c] - title[c].length())/2);
					System.out.print(title[c]);
					gap(spaces[c]-((spaces[c]-title[c].length())/2)-title[c].length());
				}
				
			}
			if(printBorders==true) {System.out.print("|");}
			System.out.println();
		}	
		
		
		
		
		if(printBorders==true) {printLine();} 
		for(int r=0; r<data.size();r++) {
			String[] row = data.elementAt(r);
			for(int c=0; c<cols; c++) {
				if(printBorders==true) {System.out.print("|");}
				if(alignments == null || alignments[c]== LEFT) {
					System.out.print(row[c]);
					gap(spaces[c] - row[c].length());
				}else if(alignments[c]== RIGHT) {
					gap(spaces[c] - row[c].length());
					System.out.print(row[c]);	
				}else if(alignments[c]== CENTER) {
					gap((spaces[c] - row[c].length())/2);
					System.out.print(row[c]);
					gap(spaces[c]-((spaces[c]-row[c].length())/2)-row[c].length());
				}
				
			}
			if(printBorders==true) {System.out.print("|");}
			System.out.println();
		}
		if(printBorders==true) {printLine();}
	}
}