package Lab7_2;

public class Rectangle implements Polygon {
	
	private double length, width;
	double[] sides = {length, length, width, width};
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double[] getSides() { // implementing the getSides method in Polygon interface
		double[] sides = {length, length, width, width};
		return sides;
	}
}
