package Lab7_4;

public interface QuackBehavior {
	
	// Default method which can be overriden by child classes
	default public void quack() {
		System.out.println("Quacking");
	}

}
