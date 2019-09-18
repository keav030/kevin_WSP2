package romannumerals;

public class RomanNumeral {
	private int value;
	
	public RomanNumeral(int value) {
		
	}
	
	public int[] Dcomp(int value) {
		int number = value;
		int numberAux=number;
		int i=0; int e=0;
		//tamaño de array
		while(numberAux>10) {
			numberAux=numberAux/10;
			e++;
		}
		//construccion de array
		
		int[] finalNum = new int[e+1]; 
		while(number>0) {
			finalNum[i]=number%10;
			number=number/10;
			i++;
		}
		
		for(i=0;i<finalNum.length;i++) {
			System.out.println("list "+"["+i+"]"+finalNum[i]);
		}
		return finalNum;
	}
	//==================
	public void Print() {
		String roman;
		
		
	}
	
	////////////////////////499  cdxcix
	public static void main(String[] args) {
		RomanNumeral test = new RomanNumeral(1538);
		
		
	}
}
