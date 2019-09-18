package hw01_table;

import java.util.Scanner;

public class MultiOperation {
	int number;
	
	
	void read() {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the Multplication Table Size: ");
		number= read.nextInt();
		read.close();
	}
	
	void operations() {
		int[][] tableM = new int[number][number];
		int i; int j;
		

		///////////[fill in]///////////
		for(i=0;i<tableM.length;i++) {
			tableM[i][0]=i+1;
		}
		for(j=0;j<tableM.length;j++) {
			tableM[0][j]=j+1;
		} 
		
		for(i=1;i<number;i++) {
			for(j=1;j<number;j++) {
				tableM[i][j]=tableM[i][0]*tableM[0][j];
			}
		}
		

		//////////////[Print]//////////////
		System.out.println("Table Size: "+number);
		
		for(i=0;i<number;i++) {
			for(j=0;j<number;j++) {
				String value = String.format("%5s", tableM[i][j]);
				System.out.print(" "+ value +" ");
			}
			System.out.println("");
		}
	}
	
	
}
