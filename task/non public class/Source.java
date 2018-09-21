
public  class Source {
	
	public static void main(String[] args) {
		
		sub s = new sub();
		s.show();
		
	}
	
}

private class sub {
	public void show() {
		System.out.println("private class modifier");
	}
}