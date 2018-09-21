public class ClassVar {
		
	public static void main(String[] args) {
		
		Player p1 = new Player();
		System.out.println(p1.name + " is in " + p1.club);
		
		Player p2 = new Player();
		
		//now changing the value of variables in the second object
		p2.club = "Juventus";
		System.out.println("Calling " + p2.name + " to " + p2.club);
		
		//now it is a class variable and so the value changes
		System.out.println(p1.name + " joins " + p1.club);
		
	}
}

class Player {

	static protected String name = "Ronaldo";
	static protected String club = "Real Madrid";
		
}