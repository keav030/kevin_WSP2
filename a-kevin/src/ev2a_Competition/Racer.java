package ev2a_Competition;

public class Racer {
	private String name;
	private int speed;
	private float travel;
	private float sdiv;
	
	public Racer(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	
	public void startRoad() {
		sdiv=(float)speed/100;
		travel=0;
		
	}
	
	public void move(boolean join) {
		if(join == true) {
			travel=travel+sdiv;
		}else {
			if(travel>0) {
				travel=travel-sdiv;
			}
			
		}
		
	}
	public void print() {
		System.out.print(name+" ");
		for(int i=0;i<39;i++) {
			if(i==(int)travel) {
				System.out.print("O");
			}else {
				System.out.print("_");
			}
		}
		System.out.println();
		
	}
}
