package java8;

@FunctionalInterface
interface Sayable {
	void say(String message);
}


public class MethodReferenceDemo {
	
	static void saySomething(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Sayable sayable = MethodReferenceDemo::saySomething;
		
		sayable.say("HEllo");
	}
}
