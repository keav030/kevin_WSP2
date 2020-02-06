package ex21_sapiens;
	
public class Sapiens {
	public static void main(String[] args) {
		Subject mysubject[] = new Subject[3];
		mysubject[0] = new Programming();
		mysubject[1] = new Calculus();
		mysubject[2] = new English();
		
		mysubject[0].grade();
		mysubject[0].report();
	}
}
