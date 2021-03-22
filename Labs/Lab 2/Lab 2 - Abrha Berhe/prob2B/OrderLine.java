package prob2B;

public class OrderLine {
	private Order order;
	private String OrderLineID;
	private double price;
	private int quantity;
	
	public OrderLine(String OrderLineID, double price, int quantity, Order order) {
		this.OrderLineID = OrderLineID;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}
	public String toString() {
		return    "Order Line ID: " + OrderLineID + " Price = " + price + " quantity = "+ quantity;
	}
}
