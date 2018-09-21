package alpha;
import beta.*;
public class Alpha extends Beta {
	
	//these private methods can be accessed only within the class
	private int x =10 , y = 5;
	
	private int sub() {
		return x-y;
	}
	
	public static void main(String[] args) {
		
		Sum s = new Sum();
		s.setValue(23, 54);
		System.out.println("protected methods sum: " + s.show());
		
		Alpha as = new Alpha();
		System.out.println("private methods difference: " + as.sub());
	
		AlphaOne ao = new AlphaOne();
		ao.set(5, 7);
		System.out.println("protected method: " + ao.multiply());
		
		System.out.println("protected outside the package: " + as.divide());
		
		printSample p = new printSample();
		p.printAny();
	}

}

//protected variable and methods can be accessed within the package
class Sum {
	protected int a, b;
	
	protected void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	protected int show() {
		return a+b;
	}
}

class printSample {
	public void printAny() {
		System.out.println("Displaying public method...");
	}
}