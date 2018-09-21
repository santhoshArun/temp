import java.util.Scanner;

public class Scope {
	
	String name = "Kris";		//can be accessed anywhere in the class

	public static void main(String[] args) {
		
		int roll = 40, total = 0;		//can be accessed within the main
		int[] marks = new int[5];
		
		Scope m = new Scope();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {		//loop scope (i)
			marks[i] = sc.nextInt();
			total += marks[i];
		}
		
		System.out.println("Name: " + m.name);
		System.out.println("Roll Number: " + roll);
		System.out.println("Total: " + total);
		System.out.println("Average: " + m.calcAvg(total));
	}
	
	public float calcAvg(int total) {
		int subject = 5;			//only within this method
		return (float)total/subject;
	}
	
}