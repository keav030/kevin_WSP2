package ex21_sapiens;

import java.util.Scanner;

public class Calculus extends Subject {
	private double evaluations[];
	
	
	
	public Calculus() {
		evaluations = new double[4];
		name="Calculus";
	}

	

	public void grade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 evaluations");
		for(int i=0;i<4;i++) {
			evaluations[i]=scan.nextDouble();
		}

	}

	public void report() {
		
		double ev =0;
		for(int i=0;i<4;i++) ev+=evaluations[i];
			ev/=4;	
		System.out.println("====="+name+"=====");
		System.out.println("Evaluations:   "+ev);
		System.out.println("------------------");
		System.out.println("Total Score: "+ev);	
	}

}
