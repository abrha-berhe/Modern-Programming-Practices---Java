package prob2B;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private LocalDate orderDate; 
	private List<OrderLine> orderLines; // one to many relationship
	public Order(LocalDate orderDate, String OrderLineID, double price, int quantity) {
		this.orderDate = orderDate;
		this.orderLines = new ArrayList<OrderLine>();	 
		this.orderLines.add(new OrderLine(OrderLineID, price, quantity, this));	 		
	}
	
	public List<OrderLine> getOrderLines(){
		return orderLines;
	}
	 
	public String toString() {
		String str = "Order: \n";
		for(OrderLine ol : orderLines) {
			str += ol.toString() + "\n";
		
		}
		return str;
	}
}
