package ex22_numericsystem;

public class Binary extends Number {
	
	public Binary(int value) {
		super(value);
		
	}
	
	public String toString() {
		long complete=0;
		long v =value;
		long aux=1;
		while(v>0) {
			if(v%2==0) {
				complete=complete+(0*aux);
			}else {
				complete=complete+(1*aux);
			}
			v=v/2;
			aux=aux*10;
		}
		return ""+complete;
	}

	
}
