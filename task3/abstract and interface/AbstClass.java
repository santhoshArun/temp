package abst;

import java.util.Scanner;

public class AbstClass extends Cube {
	
	public static void main(String[] args) {
		
		Cube c = new AbstClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		System.out.println("Cube of the number: " + c.calc(sc.nextInt()));
		
	}
}

abstract class Cube {
	int a;
	public int calc(int a) {
		this.a = a;
		return a*a*a;
	}
}