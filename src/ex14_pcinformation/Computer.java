package ex14_pcinformation;

import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.Semaphore;

import ex09_table.Table;

public class Computer {
	private Vector<HardwareInfo>hElements;
	private Vector<SoftwareInfo>sElements;
	//----
	public Computer() {
		hElements=new Vector<HardwareInfo>();
		sElements=new Vector<SoftwareInfo>();
		
	}
	
	public void addHWElement() {
		hElements.add(new HardwareInfo());
	}
	public void addSWElement() {
		sElements.add(new SoftwareInfo());
	}
	
	public HardwareInfo searchHW(long code) {
		for(int i=0;i<hElements.size();i++) {
			HardwareInfo hw = hElements.elementAt(i);
			if(code == hw.getCode()) {
				return hw;
			}
		}
		return null;
	}
	public SoftwareInfo searchSW(long code) {
		for(int i=0;i<hElements.size();i++) {
			SoftwareInfo sw = sElements.elementAt(i);
			if(code == sw.getCode()) {
				return sw;
			}
		}
		return null;
	}
	
	public void removeHW(HardwareInfo hw) {
		hElements.remove(hw);
	}
	public void removeSW(SoftwareInfo sw) {
		sElements.remove(sw);
	}
	//--
	public void generalReport() {
		Table t1 = new Table(new int[] {10,15,10,10,10},new int[] {Table.LEFT,Table.LEFT,Table.LEFT,Table.RIGHT,Table.LEFT},
				true, new String[] {"NAME","MANUFACTURER","STATE","WEIGHT","TYPE"});
		for(int i=0;i<hElements.size();i++) {
			HardwareInfo hw = hElements.elementAt(i);
			String[]row = {""+hw.getName(),""+hw.getManufacturer(),hw.isState()?"Ok":"Failed",""+hw.getWeigth(),""+hw.getType()};
			t1.addRow(row);
		}
		t1.print();
	}
	
	//=====================
	public static void main(String[] args) {
		Computer pc = new Computer();
		Scanner read = new Scanner(System.in);
		boolean keep=true;
		while(keep) {
			System.out.println("[-|| COMPUTER INFO ||-]");
			System.out.println(" 1. Add Hardware Info    ");
			System.out.println(" 2. Add Software Info    ");
			System.out.println(" 3. Remove Hardware Info ");
			System.out.println(" 4. Remove Software Info ");
			System.out.println(" 5. General Report");
			int option = read.nextInt();
			switch (option) {
			case 1:
				pc.addHWElement();
				break;
			case 2:
				pc.addSWElement();
				break;
			case 3:
				System.out.print("Hardware Element code:"); long code=read.nextLong();
				HardwareInfo hw = pc.searchHW(code);
				if(hw != null) {
					pc.removeHW(hw);
				}
				break;
			case 4: 
				System.out.print("Software Element code: "); code=read.nextLong();
				SoftwareInfo sw = pc.searchSW(code);
				if(sw!=null) {
					pc.removeSW(sw);
				}
				break;
			case 5:
				pc.generalReport();
				break;
				
			}
			
			
			
			
		}
		
		
		
	}
	
}
