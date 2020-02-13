package ex21_sapiens;

import java.util.Scanner;

public class English extends Subject {
	private double evaluations[];
	private double homeworks[];
	
	public English() {
		evaluations = new double[3];
		homeworks = new double[4];
		name="English";
	}
	
	public void grade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 evaluations");
		for(int i=0;i<3;i++) {
			evaluations[i]=scan.nextDouble();
		}
		System.out.println("Enter 4 homework");
		for(int i=0;i<4;i++) {
			homeworks[i]=scan.nextDouble();
		}

	}

	
	public void report() {
		double ev =0;
		for(int i=0;i<3;i++) ev+=evaluations[i];
			ev/=3;
		
		double hw =0;
		for(int i=0;i<4;i++) hw+=homeworks[i];
			hw/=4;
		
		double total = ev*0.7 + hw*0.3;
		System.out.println("====="+name+"=====");
		System.out.println("Evaluations:   "+ev);
		System.out.println("Homeworks:     "+hw);
		System.out.println("------------------");
		System.out.println("Total Score: "+total);
	 
	}

}
