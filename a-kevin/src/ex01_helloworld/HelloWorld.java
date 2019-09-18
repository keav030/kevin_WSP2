package ex01_helloworld;

public class HelloWorld {
	public static void main(String args[]) {
		Message message1, message2, message3;
		message1 = new Message("Starting");
		message2 = new Message("comentario 2");
		message3 = new Message("Comentario 3");
		
		message1.show();
		message2.show();
		message3.show();
	}
}
