package riding;

public class Over {
	
	public static void main(String[] args) {
		
		SubClass s = new SubClass();
		s.print();
		s.show();
		SubClass d = new DerivedClass();
		d.show();
		
		System.out.println("Overloaded show() n value: " + s.show(10));
		
	}
}

class SubClass {
	final void print() {
		System.out.println("base class print");
	}
	void show() {
		System.out.println("base class show");
	}
	int show(int n) {
		return n;
	}
}

class DerivedClass extends SubClass {
	void show() {
		System.out.println("Derived class show");
	}
}