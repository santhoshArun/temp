public class ShowSize {
	public static void main(String[] args) {
		System.out.println("\nsize of integer: " + Integer.SIZE + "bits or " + Integer.SIZE/8 + "bytes");
		System.out.println("size of float: " + Float.SIZE + "bits or " + Float.SIZE/8 + "bytes");
		System.out.println("size of double: " + Double.SIZE + "bits or " + Double.SIZE/8 + "bytes");
		System.out.println("size of short: " + Short.SIZE + "bits or " + Short.SIZE/8 + "bytes");
		System.out.println("size of long: " + Long.SIZE + "bits or " + Long.SIZE/8 + "bytes");
		System.out.println("size of byte: " + Byte.SIZE + "bits or " + Byte.SIZE/8 + "bytes");
		System.out.println("size of character: " + Character.SIZE + "bits or " + Character.SIZE/8 + "bytes");
	}
}