package ex21_sapiens;

import java.util.Scanner;

public class Programming extends Subject {
	private double evaluations[];
	private double homeworks[];
	
	//----------------------------
	public Programming() {
		evaluations = new double[5];
		homeworks = new double[4];
		name="Programmin II";
	}
	
	
	@Override
	public void grade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 evaluations");
		for(int i=0;i<5;i++) {
			evaluations[i]=scan.nextDouble();
		}
		System.out.println("Enter 4 homework");
		for(int i=0;i<4;i++) {
			homeworks[i]=scan.nextDouble();
		}
	}

	@Override
	public void report() {
		double ev =0;
		for(int i=0;i<5;i++) ev+=evaluations[i];
			ev/=5;
		
		double hw =0;
		for(int i=0;i<4;i++) hw+=homeworks[i];
			hw/=4;
		
		double total = ev*0.8 + hw*0.2;
		System.out.println("====="+name+"=====");
		System.out.println("Evaluations:   "+ev);
		System.out.println("Homeworks:     "+hw);
		System.out.println("------------------");
		System.out.println("Total Score: "+total);
	} 
	
	
}
