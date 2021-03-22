package Lab5_2_Duck_Game;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(new Squeak(),new CannotFly());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("Displaying Rubber Duck");
	}
	
 
}
