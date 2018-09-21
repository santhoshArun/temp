package override;

public class TopClass {
	
	public static void main(String[] args) {
		
		addition a = new addition(12, 20);
		System.out.println(a);
		
	}
}

class addition {
	
	int a, b, c;
	
	public addition(int a, int b) {
		this.a = a;
		this.b = b;
		c = a+b;
	}
	
	public String toString() {
		return String.format("" + c);
	}
}