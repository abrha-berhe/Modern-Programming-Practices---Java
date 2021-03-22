package Lab7_4;

public interface FlyBehavior {
	
	// Default method which can be overriden by child classes
	default public void fly() {
		System.out.println("Flying with wings");
	}

}
