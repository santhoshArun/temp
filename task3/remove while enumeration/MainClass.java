package enumeration;

import java.util.Properties;
import java.util.Enumeration;

public class MainClass {
	
	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		p.setProperty("brand", "DELL");
		p.setProperty("OS", "windows");
		p.setProperty("processor", "2.4Ghz");
		p.setProperty("RAM", "4GB");
		p.setProperty("HDD", "1TB");
		
		Enumeration elements = p.elements();
		
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
			p.remove("RAM");
		}
		
	}
}