package Lab5_2_Duck_Game;

public class MallerDuck extends Duck{

	public MallerDuck() {
		super(new Quack(), new FlyWithWings());
 	}

	@Override
	public void display() {
System.out.println("Displaying Maller Duck");		
	}
	

}
