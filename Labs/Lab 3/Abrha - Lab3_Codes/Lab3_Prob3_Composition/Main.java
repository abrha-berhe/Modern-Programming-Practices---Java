package Lab3_Prob3_Composition;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Cylinder> cylinders = new ArrayList<>();
		cylinders.add(new Cylinder(2, 4));
		cylinders.add(new Cylinder(5, 10));
		System.out.println(cylinders);
		
		System.out.println("Areas of the cirlces:");
		for(Cylinder s : cylinders) {
			System.out.println(s.getCircle().toString() + ": "
					+ s.getCircle().computeArea());
		}
		
		// Area Fixed 
	}
}
