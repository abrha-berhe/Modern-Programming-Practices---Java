package Lab10_04;

import static Lab10_04.PredicateWithException.unchecked;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GuestListPostJava8 {

	public static void main(String[] args) {
		final boolean yes = true;
		final boolean no = false;
		GuestListPostJava8 guests = new GuestListPostJava8();
		List<Guest> invitedGuests
		  = Arrays.asList(new Guest("Joe Stevens", Status.COMMON, Gender.M, 5, yes),
				          new Guest("Susan Richards", Status.GOLD, Gender.F, 10, no),
				          new Guest("Toni Smith", Status.COMMON, Gender.F, 4, yes),
				          new Guest("Anthony Hawkins", Status.ILLEGAL, Gender.M, 0, yes),
				          new Guest("Tony Thomas", Status.SILVER, Gender.M, 8, no),
				          new Guest("Antoinette Cerisier", Status.SILVER, Gender.F, 7, yes),
				          new Guest("Ricardo Salhuega", Status.COMMON, Gender.M, 2, yes));

		guests.printListOfExpectedFemaleGuests(invitedGuests);

	}
	private boolean checkLegal(Guest g) throws IllegalGuestException {
		boolean isIllegal = (g.getStatus() == Status.ILLEGAL);
		if(isIllegal) throw new IllegalGuestException(String.format(
					"Illegal guest %s has attempted entry to the event", g.getName()));
		else return true;
	}

	public void printListOfExpectedFemaleGuests(List<Guest> invited) {
		String output = invited.stream().filter(g -> unchecked((Guest t) -> checkLegal(t)).test(g))
				   .filter(g -> (g.getGender()==Gender.F))
				   .filter(g -> g.isPlanningToCome())
				   .map(g -> g.getName())
				   .sorted().collect(Collectors.joining(", "));
		
		System.out.println(output);

	}


	class IllegalGuestException extends Exception {
		private static final long serialVersionUID = 1L;
		IllegalGuestException() {
			super("An illegal guest has attempted entry.");
		}
		IllegalGuestException(String msg) {
			super(msg);
		}
		IllegalGuestException(Throwable t) {
			super(t);
		}
	}
}
