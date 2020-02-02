package abstractclass_interface;

public class Run {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.eat("fish");
		animal.sleep(5);
		animal.makeNoise();
		
		animal = new Cow();
		animal.eat("grass");
		animal.sleep(8);
		animal.makeNoise();
	}
}
