package Lab5_2_Duck_Game;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		super(new Quack(), new FlyWithWings());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("Displaying Redhead Duck");		
		
	}

}
