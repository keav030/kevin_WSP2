package ex22_numericsystem;

abstract public class Number {
	protected long value;
	
	public Number(long value) {
		super();
		this.value=value;
	}
	
	
	public long getValue() {
		return value;
	}
	public void setValue(long value) {
		this.value = value;
	}
	
	
	
	abstract public String toString();
}
