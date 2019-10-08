package ex09_table;

public class Test {
	public static void main(String[] args) {
		/*Table table = new Table(new int[] {12,20,10}, 
				new int[] {Table.RIGHT, Table.CENTER, Table.RIGHT},
				true, new String[] {"CODE","ARTICLE","PRICE"});
		table.addRow(new String[] {"A20354","White Pant","74800"});
		table.addRow(new String[] {"B54868","Shirt","210800"});
		table.addRow(new String[] {"C98799","Sox","7000"});
		
		
		table.print();*/
		Table    table = new Table(   new int[]{10,30,10},
						 new int[]{Table.LEFT,Table.CENTER,Table.RIGHT},
						 true,
						 new String[]{"CODE","ARTICLE NAME","PRICE"}
						);
		table.addRow(new String[] {"a23456","Black Shirt","85600"});
		table.addRow(new String[] {"a4255","Heat","5600"});
		table.addRow(new String[] {"c4sas","White Pant","67400"});
		table.addRow(new String[] {"b854694","Beauty Blue T-Shirt","105200"});
		table.print();
		
		
		
	}
	
}
