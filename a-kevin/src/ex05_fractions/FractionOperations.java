package ex05_fractions;

public class FractionOperations {
	public static void main (String args[]) {
		Fraction a = new Fraction(4,5);
		Fraction b = new Fraction(3,8);
		Fraction c = a.multiply(b);
		c= c.simplify();
		System.out.println(a + " x " + b + " = " + c);
		
		Fraction d = new Fraction(3,9);
		Fraction e = c.add(d);
		e=e.simplify();
		System.out.println(c + " + " + d + " = " + e);
		
		Fraction x = new Fraction(7,3);
		Fraction y = new Fraction(5,2);
		Fraction z = x.subtract(y);
		z=z.simplify();
		System.out.println(x + " - " + y + " = " + z);
		
		Fraction p = e.divide(z);
		p=p.simplify();
		System.out.println(e + " / " + z + " = " + p);
		
	}
}
