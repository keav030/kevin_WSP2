package ex05_fractions;

public class Fraction {
	///////////
	private int numerator, denominator;
	///////////
	public Fraction(int n, int d) {
		numerator=n;
		denominator=d;
	}
	public Fraction multiply(Fraction f) {
		int numeratorAux = this.numerator*f.numerator;
		int denominatorAux = this.denominator*f.denominator;
		Fraction r = new Fraction(numeratorAux, denominatorAux);
		
		return r;
	}
	public Fraction add(Fraction f) {
		int numeratorAux = (this.numerator*f.denominator)+(this.denominator*f.numerator); 
		int denominatorAux = this.denominator*f.denominator;		
		Fraction r = new Fraction(numeratorAux, denominatorAux);		
		return r;		
	}
	
	public Fraction subtract(Fraction f) {
		int numeratorAux = (this.numerator*f.denominator)-(this.denominator*f.numerator); 
		int denominatorAux = this.denominator*f.denominator;		
		Fraction r = new Fraction(numeratorAux, denominatorAux);		
		return r;
	}
	
	public Fraction divide(Fraction f) {
		int numeratorAux = this.numerator*f.denominator; 
		int denominatorAux = this.denominator*f.numerator;
		Fraction r = new Fraction(numeratorAux, denominatorAux);
		return r;
	}
	
	public Fraction simplify() {
		int mcm=1;
		int numetor = this.numerator;
		int denotor = this.denominator;
		for(int repeat = 0; repeat<Math.abs(Math.min(numetor, denotor));repeat++) {
			for(int divi =1; divi < Math.abs(Math.min(numetor, denotor));divi++) {
				if(numetor % divi == 0 && denotor % divi ==0) {
					mcm=divi;
				}	
			}
			numetor=numetor/mcm;
			denotor=denotor/mcm;
	
		}	
		
		Fraction r = new Fraction(numetor, denotor);
		return r;

	}
	public String toString() {
		return numerator+ "/"+ denominator;
	}
}
