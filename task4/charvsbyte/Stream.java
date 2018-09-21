package charbyte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Stream {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("E:/task4/charvsbyte/demo.txt");
		FileReader r = new FileReader("E:/task4/charvsbyte/demo.txt");
		int x, y;
		
		System.out.println("byte stream");
		while((x = f.read()) != -1) {
			System.out.print((char)x);
		}
		f.close();
		
		System.out.println();
		
		System.out.println("character stream");
		while((y = r.read()) != -1) {
			System.out.print((char)y);
		}
		r.close();
	}
}