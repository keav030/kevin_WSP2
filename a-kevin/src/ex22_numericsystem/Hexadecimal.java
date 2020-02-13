package ex22_numericsystem;

public class Hexadecimal extends Number {
	public Hexadecimal(long value) {
		super(value);
	}

	@Override
	public String toString() {
		String text = "";
		long number = value;
		while(number>15) {
			if(number%16<10) {
				text=number%16+text;
			}else {
				text=(char)(number%16+55) + text;
			}
			
			number /= 16;
		}
		if(number<10) {
			text=number+text;
		}else {
			text=(char)(number+55)+text;
		}
		
		return text;
	}

	
}
