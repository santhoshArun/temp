import java.util.Scanner;
public class Listen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = null;
		System.out.print("\nEnter the name: ");
		name = sc.nextLine();
		System.out.println("The name is " + name);
	}
}