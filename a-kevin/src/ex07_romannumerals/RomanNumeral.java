package ex07_romannumerals;

public class RomanNumeral {
	private int value;
	
	public RomanNumeral(int value) {
		this.value = value;
	}
	
	//==================
	public void Print() {
		String roman = "";
		//[[==============================]]
		int number = this.value;
		int numberAux=number;
		int i=0; int e=0;
		//========
		while(numberAux>10) {
			numberAux=numberAux/10;
			e++;
		}
		//===========
		int[] values = new int[e+1]; 
		i=e;
		while(number>0) {
			values[i]=number%10;
			number=number/10;
			i--;
		}
		
		for(i=0;i<values.length;i++) {
			System.out.println("list "+"["+i+"]"+values[i]);
		}
		//[[==============================]]
		
		
		//================
		int j = e;
		if(values[j]>0 && values[j]<=3) {
			roman=unit(values[j]);
		}else if(values[j]==4) {
			roman="IV";
		}else if(values[j]>4 && values [j]<9) {
			
		}
		
		
		
		System.out.println("test: "+ roman);
	}
	//=====================
	public String unit(int num) {
		String romanI = "";
		for(int i=0;i<num;i++) {
			romanI = romanI+"I";
		}
		return romanI;
	//=====================
	}
	////////////////////////
	public static void main(String[] args) {
		RomanNumeral test = new RomanNumeral(2334);
		
		test.Print();
	}
}
