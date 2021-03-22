package Lab5_3;

public class Triangle implements Shape {
	private double base, height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		return 0.5 * this.base * this.height;
	}

}
