package Excep;

import java.util.Scanner;

public class Excpuserdefined {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		ageRestriction a = new ageRestriction("your age is restricted");
		try {
			if(age < 18) {
				throw a;
			} else {
				System.out.println("okay");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

class ageRestriction extends Exception {
	public ageRestriction(String str) {
		super(str);
	}
}
