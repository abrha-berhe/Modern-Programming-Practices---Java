package Lab7_4;

public class RubberDuck extends Duck {

	@Override
	public void fly() { // Overriding fly method of FlyBehavior
		System.out.println("Cannot fly");
	}
	
	@Override
	public void quack() { // Overriding quack method of QuackBehavior
		System.out.println("Squeacking");
	}
	@Override
	public void display() { // implementing display method of Duck
		System.out.println("Displaying");

	}

}
