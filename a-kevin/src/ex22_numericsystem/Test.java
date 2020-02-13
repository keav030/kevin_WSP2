package ex22_numericsystem;

public class Test {
	
	public static long add(Number n1, Number n2) {
		return n1.getValue()+n2.getValue();
		
	}
	
	
	public static void main(String[] args) {
		Number dec = new Decimal(6749);
		Number bin = new Binary(6749);
		Number hex = new Hexadecimal(6749);
		Number oct = new Octal(6749);
		
		System.out.println("Decimal:      "+dec.toString());
		System.out.println("Binary :      "+bin.toString());
		System.out.println("Hexadecimal:  "+hex.toString());
		System.out.println("Octal:        "+oct.toString());
		
		long sum= add(bin,oct);
		System.out.println("value:        "+sum);
	}
}
