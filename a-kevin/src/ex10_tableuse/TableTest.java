package ex10_tableuse;

import ex09_table.Table;

public class TableTest {
	public static void main(String[] args) {
		Table multiplicationTable = new Table(new int [] {3,3,3,3,5},
				new int[] {Table.RIGHT, Table.CENTER, Table.RIGHT, Table.CENTER, Table.RIGHT});
		
		for(int i=1;i<10;i++) {
			multiplicationTable.addRow(new String[] {"8","x",""+i,"=",""+(8*i)});
		}
		
		//multiplicationTable.print();
		
		//=======================
		
		Table calendar = new Table(new int[] {5,5,5,5,5,5,5}, new int[] {Table.RIGHT,Table.RIGHT,Table.RIGHT,Table.RIGHT,Table.RIGHT,Table.RIGHT,Table.RIGHT},
				false, new String[] {"SUN","MON","TUE","WED","THU","FRI","SAT"});
		
		String[] week = new String[7];
		int dayOfWeek=0;
		int i=1;
		while(i<31) {
			if(dayOfWeek>6) {
				calendar.addRow(week);
				week = new String[7];
				dayOfWeek=0;
			}
			week[dayOfWeek]= ""+i;
			dayOfWeek++;
			i++;			
		}
		while(dayOfWeek<7) {
			week[dayOfWeek]="";
			dayOfWeek++;
		}
		calendar.addRow(week);
		//calendar.print();
		
	}
}
