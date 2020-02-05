package ex19_multimedia;

import java.util.Scanner;

public class Audio extends Multimedia {
	//-------------------------------------------
	private	int		bitrate;
	private	String	artist;
	//-------------------------------------------
	public Audio(long size, String name, String date, String format, int bitrate, String artist) {
		super(size, name, date, format);
		this.bitrate = bitrate;
		this.artist = artist;
	}
	//-------------------------------------------
	public Audio() {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitrate:        ");	bitrate	= scan.nextInt();
		System.out.print("Artist:         ");	artist	= scan.next();
	}
	//-------------------------------------------
	public int getBitrate() {
		return bitrate;
	}
	public void setBitrate(int bitrate) {
		this.bitrate = bitrate;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	//-------------------------------------------
	public void print() {
		super.print();
		System.out.println("Bitrate:      " + bitrate);
		System.out.println("Artist:       " + artist);
	}
	
}
