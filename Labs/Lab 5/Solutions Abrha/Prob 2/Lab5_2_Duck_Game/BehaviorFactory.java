package Lab5_2_Duck_Game;

public class BehaviorFactory {
	private static final CannotFly CANNOT_FLY = new CannotFly();
	private static final FlyWithWings CAN_FLY = new FlyWithWings();
	private static final Quack QUACK = new Quack();
	private static final Squeak SQUEAK = new Squeak();
	private static final MuteQuack MUTE = new MuteQuack();

	public static FlyBehavior getFlyBehavior(Duck duck) {

		if (duck.getClass().equals(DecoyDack.class) || duck.getClass().equals(RubberDuck.class)) {
			return CANNOT_FLY;

		} else
			return CAN_FLY;
	}

	public static QuackBehavior getQuackBehavior(Duck duck) {

		if (duck.getClass().equals(MallerDuck.class) || duck.getClass().equals(RedheadDuck.class)) {
			return QUACK;

		} else if (duck.getClass().equals(RubberDuck.class)) {
			return SQUEAK;
		}

		else
			return MUTE;
	}

}
