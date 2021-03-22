package Lab4_C;

public class Hourly extends Employee {
	
	private double hourlyWage;
	private double hoursPerWeek;
	private final int WEEKSINAMONTH = 4;
	
	public Hourly(double hourlyWage, double hoursPerWeek, String empId) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	double calcGrossPay(int month, int year) {
		return hourlyWage*hoursPerWeek*WEEKSINAMONTH;
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	
	public double getHoursPerWeek() {
		return hoursPerWeek;
	}
	
}
