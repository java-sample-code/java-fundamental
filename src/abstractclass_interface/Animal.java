package abstractclass_interface;

public abstract class Animal {
	
	String name;
	
	public void eat(String food) {
		System.out.println("This animal eats " + food);
	}
	public void sleep(int hours) {
		System.out.println("This animal sleeps " + hours + " hours");
	}
	public abstract void makeNoise();
}
