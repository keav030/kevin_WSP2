package ex09_table;

public class Test {
	public static void main(String[] args) {
		Table table = new Table(new int[] {12,20,10}, 
				new int[] {Table.RIGHT, Table.CENTER, Table.RIGHT},
				true/*, new String[] {"CODE","ARTICLE","PRICE"*/);
		table.addRow(new String[] {"A20354","White Pant","74800"});
		table.addRow(new String[] {"B54868","Shirt","210800"});
		table.addRow(new String[] {"C98799","Sox","7000"});
		
		
		table.print();
	}
	
}
