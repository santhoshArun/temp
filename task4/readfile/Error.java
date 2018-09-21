package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Error {
	
	public static void main(String[] args) throws IOException {
		 
		FileInputStream f = new FileInputStream("E:\\task4\\readfile\\data.txt");
		InputStreamReader i = new InputStreamReader(f);
		int temp;
		
		while((temp = i.read()) != -1) {
			System.out.print((char)temp);
		}
	}
	
}