package Lab7_4;

public abstract class Duck implements FlyBehavior, QuackBehavior {
	
	public abstract void display(); // to be implemented by grand childs

	public void swim() {
		System.out.println("Swimming");
	}

}
