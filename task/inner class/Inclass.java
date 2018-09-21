package inner;

public class Inclass {
	
	public static void main(String[] args) {
		
		sub s = new sub() {
			void display() {
				System.out.println("\ndisplaying anonymous class...");
			}
		};
		s.display();
		
		one o = new one();
		o.show();
	}
}

class one {
	class two {
		public void show() {
			System.out.println("now its Inner class...");
		}
	}
	two t = new two();
	public void show() {
		t.show();
	}
}
abstract class sub {
	void display() {
		
	}
}