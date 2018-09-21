package one;
import java.util.Scanner;
import two.*;

public class MainPrg {
	public static void main(String[] args) {
		Square s = new Square();
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter any number: ");
		number = sc.nextInt();
		
		System.out.println(s.squareNumber(number));
		
		
	}
}