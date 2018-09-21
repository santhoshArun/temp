public class InstVar {
		
	public static void main(String[] args) {
		
		Player p1 = new Player();
		System.out.println(p1.name + " is in " + p1.club);
		
		Player p2 = new Player();
		
		//now changing the value of variables in the second object
		p2.club = "Barcelona";
		System.out.println("Calling " + p2.name + " to " + p2.club);
		
		//as it is instance variable, the value still remains same in p1
		System.out.println(p1.name + " stays in " + p1.club);
		
	}
}

class Player {

	protected String name = "Ronaldo";
	protected String club = "Real Madrid";
		
}