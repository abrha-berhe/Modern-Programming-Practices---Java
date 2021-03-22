package Lab4_C;

import java.time.LocalDate;
import java.util.List;

public abstract class Employee {
	private String empId;

	Employee(String empId) {
		this.empId = empId;
	}

	public void print() {
		
		System.out.println("\n" + this.getClass().getSimpleName() + " Employee with ID " + empId);
		Paycheck paycheck = clacCompensation(LocalDate.now().getMonthValue(), LocalDate.now().getYear());
		paycheck.print();
	}

	public Paycheck clacCompensation(int month, int year) {
		
		double grossPay = calcGrossPay(month, year);
		Paycheck pc = new Paycheck(grossPay);
		return pc;
	}

	abstract double calcGrossPay(int month, int year);
}
