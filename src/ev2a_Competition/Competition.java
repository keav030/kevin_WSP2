package ev2a_Competition;

import java.util.Scanner;

public class Competition {
	public static void main(String[] args) {
		Racetrack c2019 = new Racetrack();
		boolean keepRunning = true;
		
		c2019.addRacer("Ferrary", 70);
		c2019.addRacer("Ferrary", 10);
		c2019.addRacer("Ferrary", 50);
		
		c2019.start();
		
		while(keepRunning) {
			String option;
			Scanner scanner = new Scanner(System.in);
			
			c2019.showCurrentPosition();
			
			System.out.println("[N]ext   [B]ack   e[X]it: ");
			option = scanner.nextLine().toLowerCase();
			
			switch(option) {
			case "n":
				c2019.next();
				break;
			case "b":
				c2019.back();
				break;
			case "x":
				keepRunning=false;
			}
		}
		
	}
}
