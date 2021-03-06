package hw04_primenumbers;

public class PrimeNumbers {
	private int quantity;
	private int primes[];
	
	public PrimeNumbers(int quantity) {
		this.quantity = quantity;
		primes = new int[quantity];
		int countP=0;
		int number=1;
		while (countP<quantity) {
			int countD=0;
			for(int divi=1;divi<=number;divi++) {
				if(number%divi==0) {
					countD++;
				}
			}
			if(countD==2) {
				primes[countP]=number;
				countP++;
			}
			number++;
		}
		
	}
	public int[] getNumbers() {
		int[] vector = new int[quantity];
		for(int i=0;i<quantity;i++) {
			vector[i]=primes[i];
		}
		return vector;
	}
	
	public void print() {
		for(int i=0; i<quantity;i++) {
			System.out.print("["+primes[i]+"]");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers(40);
		primeNumbers.print();
		int p[] = primeNumbers.getNumbers();
		
		//test
		for(int i=0; i<p.length;i++) {
			System.out.print("["+p[i]+"]");
		}
		
	}
	
}
