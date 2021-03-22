package Lab7_4;

public class DecoyDuck extends Duck {
	
	@Override
	public void fly() { // Overriding fly method of FlyBehavior
		System.out.println("Cannot fly");
	}
	
	@Override
	public void quack() { // Overriding quack method of QuackBehavior
		System.out.println("Cannot quack");
	}
	
	@Override
	public void display() { // implementing display method of Duck
		System.out.println("Displaying");

	}

}
