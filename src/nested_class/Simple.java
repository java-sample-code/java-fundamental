package nested_class;

public class Simple {
	private String msg = "This is message";
	
	void display() {
		// Local Inner Class
		class Local {
			void showMessage() {
				System.out.println(msg);
			}
		} 
		Local local = new Local();
		local.showMessage();
	}
	
	public static void main(String[] args) {
		Simple simple = new Simple();
		simple.display();
	}
}
