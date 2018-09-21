public class SubClass {
	private int a, b, c;
	
	public void getValues(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void calculation() {
		c = a * b;
	}

	public int display() {
		return c;
	}
}