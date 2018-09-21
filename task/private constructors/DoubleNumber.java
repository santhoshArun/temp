import java.util.Scanner;

public class DoubleNumber {
	
	public static void main(String[] args) {
		
		int number;
		DoubleValue dv = DoubleValue.thro();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		number = sc.nextInt();
		System.out.println("The double of the number is: " + dv.calculate(number));
	}
	
}

class DoubleValue {
	
	private static DoubleValue d = new DoubleValue();
	
	int pow = 0;
	
	private DoubleValue() {
		pow = 2;
	}
	
	public int calculate(int number) {
		return (number * pow);
	}
	
	static public DoubleValue thro() {
		return d;
	}
	
}