package packet;

public class FinClass {
	
	public static void main(String[] args) {
		
		FinalSub f = new FinalSub();
		System.out.println(f.assign());
		
	}
}

class Sub {
	public int number;
}

final class FinalSub extends Sub {
	Sub s = new Sub();
	public int assign() {
		s.number = 10;
		return s.number;
	}
}