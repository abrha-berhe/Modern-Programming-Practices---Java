package Lab4_C;

import java.time.LocalDate;

public class Order {

	private int orderNo;
	private LocalDate orderDate;
	private int orderAmount;
	private Commissioned commissioned;

	Order(int orderNo, LocalDate orderDate, int orderAmount, Commissioned commissioned) {
		this.commissioned = commissioned;
		this.orderDate =orderDate;
		this.orderNo = orderNo;
		this.orderAmount = orderAmount;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public int getOrderAmount() {
		return orderAmount;
	}
	
	public int orderAmount() {
		return orderAmount;
	}

}
