package java8;

interface ISayable {
	void say(String message);
	default void sayHello () {
		System.out.println("Hello");
	}
}

public class DefaultMethodDemo implements ISayable{

	@Override
	public void say(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		DefaultMethodDemo defaultMethodDemo = new DefaultMethodDemo();
		defaultMethodDemo.sayHello();
		defaultMethodDemo.say("HI");
	}

}
