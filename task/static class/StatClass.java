package pack;

public class StatClass {
	
	public static void main(String[] args) {
		
		Sub.Inner s = new Sub.Inner();
		s.print();
	}
}

class Sub {
	static class Inner {
		public void print() {
			System.out.println("method from static inner class");
		}
	}
}