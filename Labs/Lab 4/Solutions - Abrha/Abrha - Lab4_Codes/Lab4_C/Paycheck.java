package Lab4_C;

public class Paycheck {
	private double grossPay;
	private final double FICA = 0.23;
	private final double STATE = 0.05;
	private final double LOCAL = 0.01;
	private final double MEDICARE = 0.03;
	private final double SOCIALSECURITY = 0.075;

	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
	}

	public void print() {
		System.out.println("\nGross Pay: " + grossPay
				+ "\nFICA: " + grossPay*FICA 
				+ "\nSTATE: " + grossPay*STATE
				+ "\nLOCAL: " + grossPay*LOCAL
				+ "\nMEDICARE: " + grossPay*MEDICARE
				+ "\nSOCIAL SECURITY" + grossPay*SOCIALSECURITY
				+ "\nNet Pay: " + getNetPay());
	}

	public double getNetPay() {
		return grossPay - grossPay * FICA - grossPay * STATE - grossPay * LOCAL - grossPay * MEDICARE
				- grossPay * SOCIALSECURITY;
	}

	public String toString() {
		return "" + getNetPay();
	}
}
