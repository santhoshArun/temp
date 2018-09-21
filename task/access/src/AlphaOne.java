package alpha;

//as protected can be accessed within the package
public class AlphaOne {
	
	public int a, b;
	
	protected void set(int x, int y) {
		a = x;
		b = y;
	}
	
	protected int multiply () {
		return a*b;
	}

}
