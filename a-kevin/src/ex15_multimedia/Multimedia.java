package ex15_multimedia;

import java.util.Scanner;

public class Multimedia {
	//---------------------------------------------------
		//Atributos
		protected long   size;
		protected String name;
		protected String date;
		protected String format;
		//---------------------------------------------------
		//Constructor
		public Multimedia() {
			Scanner key = new Scanner(System.in);
			System.out.println("====================================");
			System.out.println("Size:          "); size   = key.nextLong();
			System.out.println("Name:          "); name   = key.next();
			System.out.println("Date:          "); date   = key.next();
			System.out.println("Format:        "); format = key.next();
		}
		//Constructor usando parametros
		public Multimedia(long size, String name, String date, String format) {
			super();
			this.size = size;
			this.name = name;
			this.date = date;
			this.format = format;
		}
		//---------------------------------------------------
		//Getters and setters
		public long getSize() {
			return size;
		}
		public void setSize(long size) {
			this.size = size;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getFormat() {
			return format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
}
