package Lab5_4;

import java.time.LocalDate;

public class CustomerOrderFactory {

	private Customer customer;
	private Order order;

	public void createCustomer(String name) {
		this.customer = new Customer(name);
 	}

	public void createOrder(LocalDate date) {
		this.order = Order.newOrder(this.customer, date);
	 
	}
	public Customer getCustomer() {
		return customer;
	}

	public Order getOrder() {
		return order;
	}

}
