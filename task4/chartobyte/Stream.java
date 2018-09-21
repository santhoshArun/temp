package charbyte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Stream {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("E:\\task4\\chartobyte\\din.txt");
		FileOutputStream o = new FileOutputStream("E:\\task4\\chartobyte\\dout.txt");
		OutputStreamWriter out = new OutputStreamWriter(o);
		
		int i;
		while((i = f.read()) != -1) {
			out.write(i);
		}
		f.close();
		out.close();
		
	}
}