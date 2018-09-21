package variable;

public class StaticVar {
	
	public static void main(String[] args) {
		
		Sub obj1 = new Sub();
		
		obj1.variableWithoutStatic = 10;
		obj1.variableWithStatic = 10;
		
		System.out.println("normal variable before change: " + obj1.variableWithoutStatic);
		System.out.println("static variable before change: " + obj1.variableWithStatic);
		
		Sub obj2 = new Sub();
		
		obj2.variableWithoutStatic = 30;
		obj2.variableWithStatic = 30;
		
		System.out.println("\nsecond object normal variable: " + obj2.variableWithoutStatic);
		System.out.println("second object static variable: " + obj2.variableWithStatic);
		
		System.out.println("\nnormal variable after change: " + obj1.variableWithoutStatic);
		System.out.println("static variable after change: " + obj1.variableWithStatic);
		
	}
}

class Sub {
	public int variableWithoutStatic;
	public static int variableWithStatic;
}