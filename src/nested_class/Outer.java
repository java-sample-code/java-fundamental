package nested_class;

public class Outer {
	private static int code = 1;
	private static String name = "Dara";
	private static String birth = "11-Jul-1992";
	
	// Static Inner Class
	static class Inner {
		public String toString() {
			return code + "\t" + name + "\t" + birth ;
		}
	}
	
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		String str = inner.toString();
		System.out.println(str);
	}
}
