import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sbf = new StringBuffer();

		System.out.print("Enter any string to reverse: ");
		sbf.append(sc.nextLine());
		sbf.reverse();
		System.out.println("\n" + sbf);
	}
}