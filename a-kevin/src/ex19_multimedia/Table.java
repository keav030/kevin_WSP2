package ex19_multimedia;

import java.util.Vector;

public class Table {
	//------------------------------------------
	public static int	LEFT	= 1;
	public static int	RIGHT	= 2;
	public static int	CENTER	= 3;
	//------------------------------------------
	private	int[]				spaces;	
	private	int[]				alignments;
	private	String[]			headers;
	private Vector<String[]>	data;
	private boolean				printBorders;

	//------------------------------------------
	public Table(int[] spaces) {
		this.spaces 		= spaces;
		this.alignments		= null;
		this.headers		= null;
		this.printBorders 	= false;
		
		data	= new Vector<String[]>();
	}
	//------------------------------------------
	public Table(int[] spaces,int[] aligments) {
		this.spaces 		= spaces;
		this.alignments		= aligments;
		this.headers		= null;
		this.printBorders 	= false;
		
		data	= new Vector<String[]>();
	}
	//------------------------------------------
	public Table(int[] spaces,int[] aligments,boolean printBorders) {
		this.spaces 		= spaces;
		this.alignments		= aligments;
		this.headers		= null;
		this.printBorders 	= printBorders;
		
		data	= new Vector<String[]>();
	}
	//------------------------------------------
	public Table(int[] spaces,int[] aligments,boolean printBorders,String[] headers) {
		this.spaces 		= spaces;
		this.alignments		= aligments;
		this.headers		= headers;
		this.printBorders 	= printBorders;
		
		data	= new Vector<String[]>();
	}
	//------------------------------------------
	public void addRow(String[] row) {
		data.add(row);
	}
	//------------------------------------------
	private void gap(int lenght) {
		for (int g=0; g<lenght; g++) {
			System.out.print(" ");
		}
	}
	//------------------------------------------
	private void printLine() {
		for (int c=0; c<spaces.length; c++) {
			System.out.print("+");
			for (int i=0; i<spaces[c]; i++) {
				System.out.print("-");
			}
		}
		System.out.println("+");
	}
	//------------------------------------------
	public void print() {

		int columns = spaces.length;
		
		if (headers != null) {
			if (printBorders) printLine();
			
			for (int i=0; i<columns; i++) {
				if (printBorders) System.out.print("|");
				if (alignments==null || alignments[i] == LEFT) {
					System.out.print(headers[i]);
					gap( spaces[i]-headers[i].length() );
				} else if (alignments[i] == RIGHT) {
					gap( spaces[i]-headers[i].length() );
					System.out.print(headers[i]);
				} else if (alignments[i] == CENTER) {
					gap ( (spaces[i]-headers[i].length())/2 );
					System.out.print(headers[i]);
					gap ( spaces[i]-(spaces[i]-headers[i].length())/2 - headers[i].length() );
				}
			}
			if (printBorders) System.out.print("|");
			System.out.println();
		}
		
		if (printBorders) printLine();
		
		for (String[] row: data) {
			for (int i=0; i<columns; i++) {
				if (printBorders) System.out.print("|");
				if (alignments==null || alignments[i] == LEFT) {
					System.out.print(row[i]);
					gap( spaces[i]-row[i].length() );
				} else if (alignments[i] == RIGHT) {
					gap( spaces[i]-row[i].length() );
					System.out.print(row[i]);
				} else if (alignments[i] == CENTER) {
					gap( (spaces[i]-row[i].length())/2 );
					System.out.print(row[i]);
					gap( spaces[i]-(spaces[i]-row[i].length())/2 - row[i].length() );
				}
			}
			if (printBorders) System.out.print("|");
			System.out.println();
		}
		
		if (printBorders) printLine();
	}
}
