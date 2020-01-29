package ex15_multimedia;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

import ex09_table.Table;

public class MultimediaLibrary {
	private Vector<Image>images;
	
	
	public MultimediaLibrary() {
		images= new Vector<Image>();
		
	}
	public void load() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("resources/images.csv")));
			String row;
			while ((row = reader.readLine()) != null  ){
				StringTokenizer items = new StringTokenizer(row,",");
				long size = Long.parseLong(items.nextToken());
				String name = items.nextToken();
				String date = items.nextToken();
				String format = items.nextToken();
				int width = Integer.parseInt(items.nextToken());
				int height = Integer.parseInt(items.nextToken());
				boolean transparent = Boolean.parseBoolean(items.nextToken());
				images.add(new Image(size,name,date,format,width,height,transparent));
			}
			
			
		} catch (IOException e) {
			
		}
		
	}
	
	//----------------------------------
	public void printImages() {
		Table table = new Table(new int [] {10,20,15,5,10,10,5}, null, true);
		
		for(int i=0; i<images.size(); i++) {
			Image img = images.elementAt(i);
			table.addRow(new String[] {""+img.getSize(),img.getName(),img.getDate(),
					img.getFormat(),""+img.getWidth(),
					""+img.getHeight(),""+img.isTransparent()});
		}
		table.print();
	}
	
	//----------------------------
	public static void main(String[] args) {
		MultimediaLibrary ml = new MultimediaLibrary();
		ml.load();
		ml.printImages();
	}
	
	
	
}
