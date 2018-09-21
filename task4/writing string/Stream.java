package charbyte;

import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
	
	public static void main(String[] args) throws IOException {
		
		String s = "This is a string writing to a file";
		byte b[] = s.getBytes();
		FileOutputStream o = new FileOutputStream("E:\\task4\\writing string\\demo.txt");
		o.write(b);
		System.out.println("written");
		o.close();
		
	}
}