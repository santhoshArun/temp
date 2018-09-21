import java.util.Properties;

public class SysProp {
	
	public static void main(String[] args) {
			
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.print("\n\nThe current working directory: ");
		System.out.print(p.getProperty("user.dir"));

	}
}