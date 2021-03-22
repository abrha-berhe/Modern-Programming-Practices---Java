package Lab5_3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Shape> shapes = Arrays.asList(new Triangle(10, 20), new Rectangle(5, 12), new Circle(8),
				new Triangle(2, 4), new Rectangle(3, 6), new Circle(5));
		double totalArea = 0.0;
		for (Shape sh : shapes) {
			totalArea += sh.computeArea();
		}

		System.out.printf("Total area of the shapes: %.2f", totalArea);
	}
}
