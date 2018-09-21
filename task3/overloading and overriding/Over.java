package pack;

public class Over {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.first();
		a.second();
		a.second(10);
		
		B b = new B();
		b.first();
		b.second();
		b.second(20);
	}
}


class A {
	public void first() {
		System.out.println("class A's first()");
	}
	
	public void second() {
		System.out.println("class A's second() without parameter");
	}
	
	public void second(int n) {
		System.out.println("class A's second() with parameter: " + n);
	}
	
}

class B extends A{
	//we can access all the methods of A since we extended the class
	public void first() {
		System.out.println("Class B's first()"); 	//but for first() we dont like to print as it is in A
	}
	
}