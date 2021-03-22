package Lab7_2;

public class Circle implements ClosedCurve {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computePerimeter() { // implementing the computePerimeter method in ClosedCurve interface
		return 2 * Math.PI * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
