package Lab3_Prob4;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		List<Property> properties = Arrays.asList(new House(10), new Condo(25), new Trailer());
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println("The total rent is:"+totalRent);

	}

}
