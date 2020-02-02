package abstractclass_interface;

public interface IAnimal {
	
	void eat(String food);
	void sleep(int hours);
	void makeNoise();
	
	default void test() {
		System.out.println("Test");
	}
}
