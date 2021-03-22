package Lab3_Prob3_Composition;

/* Using association instead of inheritance
 * 
 */
public class Circle {
	private double radius;
	
	public Circle(double radius) {

		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}
	
	public double computeArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	/* This inheritance does not make sense because this subclass is not making
	 * use of any of the services of the parent class.
	 */
}
