package Lab5_2_Duck_Game;

abstract public class Duck {
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;

	public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		this.quackBehavior = quackBehavior;
		this.flyBehavior = flyBehavior;
	}

	public void swim() {
		System.out.println("Swimming...");
	}

	public void quack() {
		//quackBehavior.quack(); // This can also work
		BehaviorFactory.getQuackBehavior(this).quack(); // Using factory If we want more abstraction
	}

	public void fly() {
		//flyBehavior.fly(); // This can also work
		BehaviorFactory.getFlyBehavior(this).fly(); // Using factory If we want more abstraction
	}

	abstract public void display();
}
