public class Test {
	public static void main(String[] args) {
		String str1 = "mission";
		String str2 = null, str3 = null;
		StringBuffer sb = new StringBuffer("mission");
		
		str2 = str1.concat("impossible");
		sb.append("impossible");

		System.out.println("String variable(Str1) when concatenated: " + str1 + "    ->still remains the same");
		System.out.println("str2: " + str2);
		System.out.println("StringBuffer variable when append: " + sb);
		
		str3 = str2.replace("im"," ");
		sb.replace(7,9," ");
		System.out.println("String variable(Str1) when replaced: " + str1 + "    ->still remains the same");
		System.out.println("str3: " + str3);
		System.out.println("StringBuffer variable when replaced: " + sb);
	}
}