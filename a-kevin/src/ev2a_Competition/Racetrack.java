package ev2a_Competition;

import java.util.Vector;

public class Racetrack {
	private Vector<Racer>racers;
	private int time=0;
	
	
	//============================
	public Racetrack() {
		racers = new Vector<Racer>();
	}
	
	
	public void addRacer(String name, int speed) {
		Racer rc = new Racer(name, speed);
		racers.add(rc);
	}
	
	

	public void start() {
		for(int i=0;i<racers.size();i++) {
			racers.elementAt(i).startRoad();
		}
		
		
	}

	public void next() {
		for (int i = 0; i <racers.size(); i++) {
			racers.elementAt(i).move(true);
		}
		time++;
		
	}

	public void back() {
		for (int i = 0; i <racers.size(); i++) {
			racers.elementAt(i).move(false);
		}
		if(time>0) {
			time--;
		}
		
	}

	public void showCurrentPosition() {
		for (int i = 0; i <racers.size(); i++) {
			racers.elementAt(i).print();
		}
		
	}


	public int getTime() {
		return time;
	}
}
