package Excep;

import java.util.Scanner;

public class Excp {
	
	public static void main(String[] args) {
		
		int dividend, divisor;
		Scanner sc = new Scanner(System.in);
		dividend = sc.nextInt();
		divisor = sc.nextInt();
		division d = new division(dividend, divisor);
		
		System.out.println(dividend + " / " + divisor + " = " + d.calculate());
	}
}

class division {
	
	int dividend, divisor, answer;
	public division(int dividend, int divisor) {
		this.dividend = dividend;
		this.divisor = divisor;
	}
	public int calculate() {
			if(divisor == 0) {
				throw new ArithmeticException("divide by 0");
			}
			answer = dividend/divisor;
			return answer;
		
	}
}