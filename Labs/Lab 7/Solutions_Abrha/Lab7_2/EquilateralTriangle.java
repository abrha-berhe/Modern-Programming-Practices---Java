package Lab7_2;

public class EquilateralTriangle  implements Polygon {
	private double side1, side2, side3;
	
	
	public EquilateralTriangle(double side) {
		this.side1 = side;
		this.side2 = side;
		this.side3 = side;
	}
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
		this.side2 = side1;
		this.side3 = side1;
	}

	@Override
	public double[] getSides() { // implementing the getSides method in Polygon interface
		double[] sides = {side1, side2, side3};
		return sides;
	}



	
	
	

}
