package Lab7_2;

public class Ellipse implements ClosedCurve {
	private double a;	 
	private double E;	 
	
	public Ellipse(double a, double E) {
		this.a = a;
		this.E= E;
	}
	
	@Override
	public double computePerimeter() { //// implementing the computePerimeter method in ClosedCurve interface
		return 4*a*E;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getE() {
		return E;
	}

	public void setE(double e) {
		E = e;
	}
}
