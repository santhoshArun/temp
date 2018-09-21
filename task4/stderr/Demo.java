package sample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		 
		FileOutputStream output = new FileOutputStream("E:/task4/stderr/output.txt");
		FileOutputStream error = new FileOutputStream("E:/task4/stderr/error.txt");
		
		PrintStream printOut = new PrintStream(output);
		PrintStream printErr = new PrintStream(error);
		
		System.setOut(printOut);
		System.setErr(printErr);
		
		System.out.println("Everything given in out.println() will be printed in output.txt");
		System.err.println("Everything given in err.println() will be printed in error.txt");
		
		System.out.println("100/20 = " + (100/20));
		System.out.println("100/0 = " + (100/0));
		
	}
	
}