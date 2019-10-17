package ev01;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

	
//valores entre 1-13
public class BlackJack {
	public int numbCard;
	private String simbolCard;
	
	public BlackJack() {
		this.numbCard=0;
		this.simbolCard="A";
	}
	
	public void generateCard() {
		Random r = new Random();
		int simbol = r.nextInt(3);
		String simbolS ="A"; 
		if(simbol==0) {
			simbolS="A";
		}else if(simbol==1) {
			simbolS="B";
		}else if(simbol==2) {
			simbolS="C";
		}else if(simbol==3) {
			simbolS="D";
		}
		this.simbolCard = simbolS;
		
		int number = r.nextInt(12)+1;
		this.numbCard=number;
		
		String cardC = simbolS+number ;
		
		
	}
	public String getCard() {
		String card= numbCard +simbolCard;
		return card;
	}
	public int getNumber() {
		return this.numbCard;
	}
	
	
	
	
	
	//================================================
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		BlackJack blackjack = new BlackJack();
		int sum=0;
		Vector <String>cardList = new Vector<String>();
		
		boolean stop=false;
		while(stop==false) {
			sum=sum+blackjack.getNumber();
			System.out.println("------------------------------------");
			for(int i=0;i<cardList.size();i++) {
				System.out.print(" "+cardList.elementAt(i) +" ");
			}
			System.out.println();
			System.out.println("------------------------------------");
			System.out.println("Sum: "+ sum);
			System.out.println("------------------------------------");
			System.out.println("[C]Continue    [S]Stop");
			String r=read.next();
			if(r.equalsIgnoreCase("S")) {
				stop=true;
			}
			if(sum==21) {
				System.out.println("You Win");
				stop=true;
			}
			if(sum>21) {
				System.out.println("You Lose");
				stop=true;
			}
			blackjack.generateCard();
			cardList.add(blackjack.getCard());
		}
		
	}
}