package ex22_numericsystem;

public class Octal extends Number {
	public Octal(int value) {
		super(value);
	}

	@Override
	public String toString() {
		String text = "";
		long number = value;
		while(number>7) {
			text=number%8+text;
			number/=8;
		}
		
		text=number+text;
		return text;
	}

	
}
