package ex19_multimedia;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class MultimediaLibrary {
	private	Vector<Multimedia>	multimedia;
	//----------------------------------------------
	public MultimediaLibrary() {
		multimedia = new Vector<>();
		
	}
	//-----------------------------------------------------------------------------
	public void load() {
		BufferedReader br;
        String line;
	    try {
	        br = new BufferedReader(new InputStreamReader(new FileInputStream("resources/images.csv")));
	        while ((line = br.readLine()) != null) {
	        	StringTokenizer items = new StringTokenizer(line,",");
	        	long 	size		= Long.parseLong(items.nextToken());
	        	String	name		= items.nextToken();
	        	String	date		= items.nextToken();
	        	String	format		= items.nextToken();
	        	int		width		= Integer.parseInt(items.nextToken());
	        	int		height		= Integer.parseInt(items.nextToken());
	        	boolean	transparent	= Boolean.parseBoolean(items.nextToken());

	        	multimedia.add(new Image(size,name,date,format,width,height,transparent));
	        }
	        br.close();

	        br = new BufferedReader(new InputStreamReader(new FileInputStream("resources/audios.csv")));
	        while ((line = br.readLine()) != null) {
	        	StringTokenizer items = new StringTokenizer(line,",");
	        	long 	size		= Long.parseLong(items.nextToken());
	        	String	name		= items.nextToken();
	        	String	date		= items.nextToken();
	        	String	format		= items.nextToken();
	        	int		bitrate		= Integer.parseInt(items.nextToken());
	        	String	artist		= items.nextToken();

	        	multimedia.add(new Audio(size,name,date,format,bitrate,artist));
	        }
	        br.close();

	        br = new BufferedReader(new InputStreamReader(new FileInputStream("resources/videos.csv")));
	        while ((line = br.readLine()) != null) {
	        	StringTokenizer items = new StringTokenizer(line,",");
	        	long 	size		= Long.parseLong(items.nextToken());
	        	String	name		= items.nextToken();
	        	String	date		= items.nextToken();
	        	String	format		= items.nextToken();
	        	String	resolution	= items.nextToken();
	        	int		duration	= Integer.parseInt(items.nextToken());

	        	multimedia.add(new Video(size,name,date,format,resolution,duration));
	        }
	        br.close();

	    } catch (IOException e) {
	        System.out.println("Failed to read users file.");
	    }
	}
	//-----------------------------------------------------------------------------
	public void listImages() {
		Table table = new Table(new int[] {10,30,10,7,7,7,11},
								new int[] {Table.RIGHT,Table.LEFT,Table.RIGHT,Table.LEFT,Table.RIGHT,Table.RIGHT,Table.LEFT},
								true,
								new String[] {"SIZE","NAME","DATE","FORMAT","WIDTH","HEIGHT","TRANSPARENT"});
		for (Multimedia media: multimedia) {
			if(media.getClass().equals(Image.class)) {
				Image image = (Image)media;
				table.addRow(new String[] {""+image.getSize(),image.getName(),image.getDate(),image.getFormat(),""+image.getWidth(),""+image.getHeight(),""+image.isTransparent()});
			}
			
		}
			
			
		
		table.print();
	}
	//-----------------------------------------------------------------------------
	public void listAudios() {
		Table table = new Table(new int[] {10,30,10,7,10,30},
								new int[] {Table.RIGHT,Table.LEFT,Table.RIGHT,Table.LEFT,Table.RIGHT,Table.LEFT},
								true,
								new String[] {"SIZE","NAME","DATE","FORMAT","BITRATE","ARTIST"});
		for (Multimedia media: multimedia) {
			if(media.getClass().equals(Audio.class)) {
				Audio audio = (Audio)media;
				table.addRow(new String[] {""+audio.getSize(),audio.getName(),audio.getDate(),audio.getFormat(),""+audio.getBitrate(),""+audio.getArtist()});
			}
		
		}
		table.print();
	}
	//-----------------------------------------------------------------------------
	public void listVideos() {
		Table table = new Table(new int[] {10,30,10,7,12,10},
								new int[] {Table.RIGHT,Table.LEFT,Table.RIGHT,Table.LEFT,Table.LEFT,Table.LEFT},
								true,
								new String[] {"SIZE","NAME","DATE","FORMAT","RESOLUTION","DURATION"});
		
		for (Multimedia media: multimedia) {
			if(media.getClass().equals(Video.class)) {
				Video video = (Video)media;
				table.addRow(new String[] {""+video.getSize(),video.getName(),video.getDate(),video.getFormat(),""+video.getResolution(),""+video.getDuration()});
			}
		}
		table.print();
	}
	//-----------------------------------------------------------------------------
	public void listAll() {
		Table table = new Table(new int[] {5,30,10});
		int index =0;
		for(Multimedia media:multimedia) {
			table.addRow(new String[] {""+index, ""+media.getName(),""+media.getSize()});
			index++;
		}
		table.print();
	}
	//------------------------------------------------------------------------------
	public void detail() {
		System.out.println("what detail?");
		Scanner read = new Scanner(System.in);
		int index=read.nextInt();
		multimedia.elementAt(index).print();;
	
	}
	//-------------------------------------------------------------------------------
	public static void main(String[] args) {
		MultimediaLibrary ml = new MultimediaLibrary();
		ml.load();
		
		/*System.out.println("\nImages List");
		ml.listImages();
		System.out.println("\nAuios List");
		ml.listAudios();
		System.out.println("\nVideos List");
		ml.listVideos();*/
		ml.listAll();
		ml.detail();
		
	}
}
