package hw05_ExpressionFractions;

import java.util.Vector;

public class Expression {
	private Vector<Fraction> fracts;
	
	public Expression() {
		fracts = new Vector<Fraction>();
		
	}
	
	public void add(Fraction fract) {
		fracts.add(fract);
	}
	
	public void print() {
		for(int i=0; i < fracts.size();i++) {
			Fraction fract = fracts.elementAt(i);
			System.out.print("("+fract+")");
			if(i != fracts.size()-1) {
				System.out.print(" + ");
			}
		}
		System.out.println("");
	}
	public Fraction operate() {
		int i=0;
		Fraction fract = fracts.elementAt(i);
		for(i=1;i<fracts.size();i++) {
			fract = fract.add(fracts.elementAt(i));
			
		}
		fract=fract.simplify();
		return fract;
	}
	
	public static void main(String[] args) {
		Expression ex = new Expression();
		ex.add( new Fraction(4,6));
		ex.add( new Fraction(-5,3));
		ex.add( new Fraction(8,3));

		ex.print();

		Fraction result = ex.operate();
		System.out.println("Result = "+result);
		
	}
}
