package ex10_tableuse;

import java.util.Random;

import ex09_table.Table;

public class BingoTable {
	private int [][] values;
	
	public BingoTable() {
		values = new int[5][5];
		Random rand = new Random();
		for(int c=0; c<5; c++) {
			for(int r=0;r<5;r++) {
				values[r][c]= rand.nextInt(20)+(20*c);
			}
		}
	}
	
	public void print() {
		Table bingotable = new Table(new int[] {6,6,6,6,6}, new int[] {Table.CENTER,Table.CENTER,Table.CENTER,Table.CENTER,Table.CENTER},
				true, new String[] {"B", "I", "N", "G", "O"}
				);
		
		for(int r =0; r<5;r++) {
			String[] row = new String[5];
			for(int c=0; c<5;c++) {
				row[c]= ""+values[r][c];
			}
			bingotable.addRow(row);
		}
		bingotable.print();
	}
	//==============
	public static void main(String[] args) {
		BingoTable bingo = new BingoTable();
		bingo.print();
	}
	
}
