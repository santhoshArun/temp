package inter;

import java.util.Scanner;

public class InterfaceClass implements Cube {
	
	int a;
	public void get(int a) {
		this.a = a;
	}
	public int calc() {
		return (int)Math.pow(a, power);
	}
	public static void main(String[] args) {
		
		InterfaceClass i = new InterfaceClass();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		i.get(sc.nextInt());
		System.out.println("Cube of the number: " + i.calc());
		
	}
}

interface Cube {
	final int power = 3;
	public void get(int a);
	public int calc();
}
