package Lab5_2_Duck_Game;

public class CannotFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Can not fly...");
		
	}

}
