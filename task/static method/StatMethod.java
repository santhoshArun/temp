package Stat;

public class StatMethod {
	
	public static void main(String[] args) {
		
		Sub.setNumber(10);
		
		System.out.println(Sub.putNumber());
		
	}
}

class Sub {
	
	static int number;
	
	public static void setNumber(int n) {
		number = n;
	}
	
	public static int putNumber() {
		return number;
	}
	
}