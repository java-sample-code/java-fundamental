package nested_class;

abstract class AnonymousInnerClass {
	abstract void showMessage();
}

public class MyClass{	
	
	public static void main(String[] args) {
		// Anonymous Inner Class
		AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {
			
			@Override
			void showMessage() {
				// TODO Auto-generated method stub
				System.out.println("This is my method");
			}
		};
		anonymousInnerClass.showMessage();
	}
}
