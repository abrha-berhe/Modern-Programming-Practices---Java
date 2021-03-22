package Lab5_2_Duck_Game;

public class DecoyDack extends Duck {

	public DecoyDack() {
		super(new MuteQuack(),new CannotFly());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("Displaying Decoy Quack");

	}

}
