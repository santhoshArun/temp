package PassByValue;

public class Passbyvalue {
	
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		swaper s = new swaper();
		System.out.print("original value: ");
		System.out.println("a = " + a + "  " + "b = " + b);
		s.swap(a, b);
		System.out.print("back to main: ");
		System.out.println("a = " + a + "  " + "b = " + b);
		
	}
}

class swaper {
	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.print("inside swaper class: ");
		System.out.println("a = " + a + "  " + "b = " + b);
	}
}