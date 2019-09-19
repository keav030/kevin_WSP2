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
		int i=0; int e=1;
		//========
		while(numberAux>10) {
			numberAux=numberAux/10;
			e++;
		}
		//====================================
		
		int[] values = new int[e+1]; 
		i=e;

		while(number>0) {
			System.out.println("Test number join: "+number+ " join i:"+i);
			values[i]=number%10; //0   8  0  1
			number=number/10;    //108 10 1  0 
			i--;                 
			System.out.println("Test number exit: "+number+ " exit i: "+i);
		}
		
		for(i=0;i<values.length;i++) {
			System.out.println("list "+"["+i+"]"+values[i]);
		}
		//[[==============================]]
		
		
		//===================================
		int j = e;
		if(values[j]>0 && values[j]<=3) {
			roman=unit(values[j],"I");
		}else if(values[j]==4) {
			roman="IV";
		}else if(values[j]>4 && values [j]<9) {
			roman=five(values[j],"I", "V");
		}else if(values[j]==9) {
			roman="IX";
		}
		System.out.println("Test:" +values.length);
		if(values.length>1) {
			j--;
			if(values[j]>0 && values[j]<=3) {
				roman=unit(values[j],"X")+roman;
			}else if(values[j]==4) {
				roman="XL"+roman;
			}else if(values[j]>4 && values [j]<9) {
				roman=five(values[j],"X", "L")+roman;
			}else if(values[j]==9) {
				roman="XC"+roman;
			}
			
		}
		if(values.length>2) {
			j--;
			if(values[j]>0 && values[j]<=3) {
				roman=unit(values[j],"C")+roman;
			}else if(values[j]==4) {
				roman="CD"+roman;
			}else if(values[j]>4 && values [j]<9) {
				roman=five(values[j],"C", "D")+roman;
			}else if(values[j]==9) {
				roman="CM"+roman;
			}
		}
		if(values.length>3) {
			j--;
			if(values[j]>0 && values[j]<=3) {
				roman=unit(values[j],"M")+roman;
			}
		}
		
		
		
		
		
		
		
		
		System.out.println("test: "+ roman);
	}
	//=====================
	public String unit(int num, String s) {
		String romanI = "";
		String simbol = s;
		for(int i=0;i<num;i++) {
			romanI = romanI+simbol;
		}
		return romanI;
	}	
		
	public String five(int num, String s, String s2) {
		String romanI = s2;
		String simbol=s;
		for(int i=0;i<num-5;i++) {
			romanI = romanI+simbol;
		}
		return romanI;
	}
	//=====================
	
	////////////////////////
	public static void main(String[] args) {
		RomanNumeral test = new RomanNumeral(1040);
		
		test.Print();
	}
}
