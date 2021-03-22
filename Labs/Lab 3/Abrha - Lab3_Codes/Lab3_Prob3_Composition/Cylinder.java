package Lab3_Prob3_Composition;

/* Association of Cylinder and Circle in stead of inheritance
 * (Composition)
 */

public class Cylinder {
	private Circle circle;
	private double height;
	
	public Cylinder(double r, double h) {
		circle = new Circle(r);
		this.height = h;
	}

	public double getHeight() {
		return height;
	}
	
	public Circle getCircle() {
		return this.circle;
	}
	public double computeVolume() { 
		return circle.computeArea()*height;
	}

	@Override
	public String toString() {
		return "Cylinder [circle=" + circle.toString() + ", height=" + height + "]";
	}
	
}
