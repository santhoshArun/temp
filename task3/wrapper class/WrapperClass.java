package cast;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		float value = 23.381f;
		
		Float floatnumber = new Float(value);
		
		int intnumber = floatnumber.intValue();
		double doublenumber = floatnumber.doubleValue();
		
		Integer intnum = new Integer(34);
		
		float floatnum = intnum.floatValue();
		double doublenum = intnum.doubleValue();
		
		System.out.println("Float value: " + value);
		System.out.println("Integer value: " + intnumber);
		System.out.println("Double value " + doublenumber);
		
		System.out.println("Integer value: " + intnum);
		System.out.println("Float value: " + floatnum);
		System.out.println("Double value " + doublenum);
		
	}
}
