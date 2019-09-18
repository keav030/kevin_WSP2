package ex04_textparser;

public class TextParser {
	////////////////
	private String text;
	////////////////
	public TextParser(String text) {
	this.text = text;
	}
	////////////////
	public int countVocals() {
	int counter = 0;
	for(int i = 0; i<text.length();i++) {
		char c = text.charAt(i);
		if(c=='a' || c=='e' || c=='i' ||c=='o'|| c=='u' || c=='A' || c=='E' || c=='I' ||c=='O'|| c=='U') {
			counter++;
		}
	}
	return counter;
	}
	////////////////
	public int countWords() {
	int counter = 1;
	for(int i = 0; i<text.length();i++) {
		char c = text.charAt(i);
		if(c == ' ') {
			counter++;
		}
	}
	return counter;
	}
	///////////
	public int countUppercases() {
	int counter=0;
	for(int i = 0; i<text.length();i++) {
		char c = text.charAt(i);
		if( (c>='A' && c<='Z') || c=='Ñ' ) {
			counter++;
		}
	}
	
	
	return counter;
	}
	//////////
	public int countLowercases() {
	int counter=0;
	for(int i = 0; i<text.length();i++) {
		char c = text.charAt(i);
		if( (c>='a' && c<='z') || c=='ñ' ) {
			counter++;
		}
	}
	return counter;
	}
	
	
	///////////main///////////
	public static void main (String args[]) {
	TextParser parser = new TextParser("We are studying at Universidad de NariÃ±o");
	
	System.out.println("Total vocals:        " + parser.countVocals());
	System.out.println("Total words:         " + parser.countWords());
	System.out.println("Total uppercases:    " + parser.countUppercases());
	System.out.println("Total lowercases:    " + parser.countLowercases());
	
	
	
	}
}
