package ev2a_cinema;

public class Cinema {
	private CinemaChair[][] chairs;
	private int row;
	private int chair;
	//------------------
	public Cinema(int row, int chair){
		this.row=row;
		this.chair=chair;
		chairs = new CinemaChair[row][chair];
		for(int i=0;i<row;i++) {
			for(int j=0;j<chair;j++) {
				chairs[i][j]=new CinemaChair(true);
			}
		}
	}
	//---------------
	public void show() {
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<chair;j++) {
				System.out.print(chairs[i][j].isState()?"[O]":"[x]");
			}
			System.out.println();
		}
		
	}
	//-----------------
	public void reserve(int row, int chair) {
		if(row > this.row || chair > this.chair) {
			System.out.println("This chair doesn't exist");
		}else if (chairs[row-1][chair-1].isState()==false){
			System.out.println("This chair was reserved");
		}else {
			chairs[row-1][chair-1].setState(false);
		}
		

	}
	
}
