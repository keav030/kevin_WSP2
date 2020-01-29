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
	private Vector<Audio>audios;
	private Vector<Video>videos;
	
	public MultimediaLibrary() {
		images= new Vector<Image>();
		audios= new Vector<Audio>();
		videos=new Vector<Video>();
	}
	public void loadImages() {
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
	public void loadAudio() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("resources/audio.csv")));
			String row;
			while ((row = reader.readLine()) != null  ){
				StringTokenizer items = new StringTokenizer(row,",");
				long size = Long.parseLong(items.nextToken());
				String name = items.nextToken();
				String date = items.nextToken();
				String format = items.nextToken();
				String duration = items.nextToken();
				String interpret = items.nextToken();
				int compretion = Integer.parseInt(items.nextToken());
				audios.add(new Audio(size,name,date,format,duration,interpret,compretion));
			}
			
			
		} catch (IOException e) {
			
		}
		
	}
	public void loadVideo() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("resources/videos.csv")));
			String row;
			while ((row = reader.readLine()) != null  ){
				StringTokenizer items = new StringTokenizer(row,",");
				long size = Long.parseLong(items.nextToken());
				String name = items.nextToken();
				String date = items.nextToken();
				String format = items.nextToken();
				String duration = items.nextToken();
				long resolution = Long.parseLong(items.nextToken());
				long fps = Long.parseLong(items.nextToken());
				boolean closecaption = Boolean.parseBoolean(items.nextToken());
				videos.add(new Video(size,name,date,format,duration,resolution,fps,closecaption));
				
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
	public void printAudio() {
		Table table = new Table(new int [] {9,40,15,5,10,30,5}, null, true);
		
		for(int i=0; i<audios.size(); i++) {
			Audio aud = audios.elementAt(i);
			table.addRow(new String[] {""+aud.getSize(),aud.getName(),aud.getDate(),
					aud.getFormat(),aud.getDuration(),aud.getInterpret(),""+aud.getCompretion()});
					
		}
		table.print();
	}
	public void printVideo() {
		Table table = new Table(new int [] {9,40,15,5,10,5,5,5}, null, true);
		
		for(int i=0; i<videos.size(); i++) {
			Video vid = videos.elementAt(i);
			table.addRow(new String[] {""+vid.getSize(),vid.getName(),vid.getDate(),
					vid.getFormat(),vid.getDuration(),""+vid.getResolution(),""+vid.getFps(),""+vid.isClosecaption()});		
		}
		table.print();
	}
	
	//----------------------------
	public static void main(String[] args) {
		MultimediaLibrary ml = new MultimediaLibrary();
		ml.loadImages();
		ml.loadAudio();
		ml.loadVideo();
		ml.printImages();
		ml.printAudio();
		ml.printVideo();
	}
	
	
	
}
