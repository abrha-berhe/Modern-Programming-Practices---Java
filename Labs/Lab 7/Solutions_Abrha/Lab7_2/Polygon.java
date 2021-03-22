package Lab7_2;

public interface Polygon extends ClosedCurve {
	
	public double[] getSides(); //
	
	default double computePerimeter() { // Computing permieter using a template pattern and implementing the promise in ClosedCurve 
		double[] sides = getSides();
		double perimeter = 0.0;
		for(double s : sides) {
			perimeter += s;
		}
		return perimeter;
	}

}
