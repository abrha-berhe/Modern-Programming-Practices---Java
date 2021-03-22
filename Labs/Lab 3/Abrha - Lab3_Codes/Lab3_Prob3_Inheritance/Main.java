package Lab3_Prob3_Inheritance;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Cylinder> shapes = new ArrayList<>();
		shapes.add(new Cylinder(2, 4));
		shapes.add(new Circle(5));
		System.out.println(shapes +""+ "\nVolume "+ shapes.get(0).computeVolume() + " Area "+ shapes.get(1).computeVolume());
		// Prints area to be zero
		
	 
	}
}
