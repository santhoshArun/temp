import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SubClass ss = new SubClass();
		int a, b;

		System.out.print("Enter any two number to multiply: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		ss.getValues(a,b);
		ss.calculation();
		System.out.println("The answer is " + ss.display());
		
	}
}