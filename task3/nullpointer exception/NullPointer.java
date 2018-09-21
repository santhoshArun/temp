package exception;

public class NullPointer {
	
	public static void main(String[] args) {
		
		sub s = null;
		
		try {
			s.show();
		} catch(NullPointerException n) {
			System.out.println("null pointer exception");
		}
	}
}

class sub {
	public void show() {
		System.out.println("class not initiated");
	}
}