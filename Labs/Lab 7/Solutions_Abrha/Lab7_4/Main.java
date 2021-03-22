package Lab7_4;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = { new MalleredDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck() };
		for (Duck d : ducks) {
			System.out.println("\n"+d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}

}



