package ev2a_cinema;

import java.util.Scanner;

public class CinemaSystem {
	public static void main(String[] args) {
		Cinema cinema = new Cinema(8,20);
		boolean keepRunning = true;
		Scanner scan = new Scanner(System.in);
		while(keepRunning) {
			
			cinema.show();
			System.out.println("[R]eserve  e[X]it");
			String option = scan.next();
			switch(option) {
			case "r":
				int row, chair;
				System.out.print("Row:   "); row=scan.nextInt();
				System.out.print("Chair: "); chair=scan.nextInt();
				cinema.reserve(row,chair);
				break;
			case "x":
				keepRunning=false;
				break;
			}
		}
	}
}
