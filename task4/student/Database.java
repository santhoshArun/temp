package marks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Database {
	
	public static void main(String[] args) throws IOException {
		
		int clas = 1;
		
		//setting destination
		File folder = new File("E:\\task4\\student\\data\\");
		FileOutputStream o = new FileOutputStream("E:\\task4\\student\\out.txt");
		PrintStream p = new PrintStream(o);
		System.setOut(p);
		
		System.out.println("name##age##phone##class");
		
		for(File f : folder.listFiles()) {
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			int i = 0;
		
			String[] roll = new String[10];
			String[] name = new String[10];
			String[] age = new String[10];
			String[] phone = new String[10];
			
			String line;
			
			while((line = br.readLine()) != null) {
			
				String sep[] = new String[4];
				sep = line.split("###");
				roll[i] = sep[0];
				name[i] = sep[1];
				age[i] = sep[2];
				phone[i] = sep[3];
				
				if(Integer.parseInt(age[i]) >= 10)
				System.out.println(name[i] + "##" + age[i] + "##" + phone[i] + "##" + clas);
				i++;
			}
			clas++;
			
		}
	}
}