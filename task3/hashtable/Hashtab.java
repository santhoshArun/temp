package hash;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Scanner;

public class Hashtab {
	
	public static void main(String[] args) throws IOException {
		
		Hashtable h = new Hashtable();
		Properties p = new Properties();
		Scanner sc = new Scanner(System.in);
		
		OutputStream out = new FileOutputStream("now.txt");
		
		//assigning hash table
		System.out.print("Enter your name: ");
		h.put("name", sc.nextLine());
		System.out.print("Enter your age: ");
		h.put("age", sc.nextLine());
		System.out.print("Enter your id: ");
		h.put("id", sc.nextLine());
		
		//to property class
		Enumeration temp;
		String str;
		temp = h.keys();
		
		while(temp.hasMoreElements()) {
			str = (String)temp.nextElement();
			p.setProperty(str, (String)h.get(str));
		}
		
		p.store(out, null);
		
		System.out.println("Showing from now.txt");
		System.out.println("name: " + p.getProperty("name"));
		System.out.println("age: " + p.getProperty("age"));
		System.out.println("id: " + p.getProperty("id"));
		
	}
}