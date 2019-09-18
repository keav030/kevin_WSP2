package ex03_multiplication;

import java.util.Scanner;

public class MultiTable {
	private int number;

	
	public void readNumber() {
		System.out.print("What table do you want to print?: ");
		Scanner read = new Scanner(System.in);
		number= read.nextInt();
		read.close();
	}
	public void printTable() {
		System.out.println("=====================");
		System.out.println("   Table of + "+number);
		System.out.println("=====================");
		for(int count=1;count<=10;count++) {
			int result=number*count;
			System.out.println("   "+number+" x "+count+"  =  "+result);
		}
		System.out.println("=====================");
	}
}
