package Lab4_C;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(double commission, double baseSalary, String empId) {
		super(empId);
		this.commission = commission / 100;
		this.baseSalary = baseSalary;
		orders = new ArrayList<Order>();
	}

	public void addOrder(int orderNo, LocalDate orderDate, int orderAmount) {
		orders.add(new Order(orderNo, orderDate, orderAmount, this));
	}

	public double getCommission() {
		return commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	@Override
	public double calcGrossPay(int month, int year) {

		double totalOrderAmount = 0;

		if (month == 1) {
			for (Order ord : orders) {

				if (ord.getOrderDate().getYear() == year-1 && ord.getOrderDate().getMonthValue() == month + 11) {
					totalOrderAmount += ord.getOrderAmount();
				}
			}
		} else {
			for (Order ord : orders) {

				if (ord.getOrderDate().getYear() == year && ord.getOrderDate().getMonthValue() == month - 1) {
					totalOrderAmount += ord.getOrderAmount();
				}
			}
		}
		return baseSalary + totalOrderAmount * commission;
	};
}
