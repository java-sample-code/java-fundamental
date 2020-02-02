package nested_class;

public class OuterClass {
	private String str = "Nested class tutorial";
	
	// Member Inner class
	class Inner {
		void print() {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		
		OuterClass outerClass = new OuterClass();
		
		OuterClass.Inner inner = outerClass.new Inner();
		inner.print();
	}
}
