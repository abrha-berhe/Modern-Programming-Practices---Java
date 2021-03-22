package Lab5_4;

import java.time.LocalDate;


public class Main {
	public static void main(String[] args) {
		CustomerOrderFactory CO = new CustomerOrderFactory();
		CO.createCustomer("Abrha");
		CO.createOrder(LocalDate.now());
		CO.getOrder().addItem("Bambula");
		CO.getOrder().addItem("Table");
		CO.getOrder().addItem("axe");
		CO.getOrder().addItem("orange");
		
		CO.createOrder(LocalDate.now());
		CO.getOrder().addItem("Tea");
		
		CO.createOrder(LocalDate.now());
		CO.getOrder().addItem("Fish");
		CO.getOrder().addItem("Banana");
		CO.getOrder().addItem("Yougurt");

		System.out.println(CO.getCustomer().getOrders());
	}
}

		
