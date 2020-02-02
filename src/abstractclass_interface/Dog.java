package abstractclass_interface;

public class Dog implements IAnimal, Speakable {

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("Dog eats "+food);
		
	}

	@Override
	public void sleep(int hours) {
		// TODO Auto-generated method stub
		System.out.println("Dog sleeps "+hours+" hours");
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("wooh wooh...");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Dog can't speak, can only bark.");
	}
	
}
