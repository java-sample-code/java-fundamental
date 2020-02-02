package java8;

interface GreetingService {
	void welcomeMessage(String message);
}

interface ICalculator {
	int calculate(int a, int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		GreetingService greetingService = message -> System.out.println(message); ;
		greetingService.welcomeMessage("Welcome everyone!");
		
		ICalculator sumCalculator = (a, b) -> a+b;
		
		System.out.println(sumCalculator.calculate(10, 20));
		
		ICalculator subCalculator = (a,b) -> a-b;
		System.out.println(subCalculator.calculate(20, 10));
	}
}
