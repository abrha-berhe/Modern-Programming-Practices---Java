package Lab5_2_Duck_Game;

public class Main {

	public static void main(String[] args) {

		Duck[] ducks = { new MallerDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDack() };
		for (Duck d : ducks) {
			System.out.println("\n"+d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}

	}
}
