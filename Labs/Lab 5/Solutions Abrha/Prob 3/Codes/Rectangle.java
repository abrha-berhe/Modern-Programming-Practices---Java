package Lab5_3;

public class Rectangle implements Shape {
private double width,height;

	public Rectangle(double width, double height) {
	this.width = width;
	this.height = height;
}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		return this.width * this.height;

	}

}
