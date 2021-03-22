package prob2B;

import java.util.*;
import java.time.*;

public class Main {
	public static void main(String[] args) {
		List<Order> orders = new ArrayList<>();
		Order order1 = new Order(LocalDate.of(2020, 9, 29), "1001", 10.00, 1);
		order1.getOrderLines().add(new OrderLine("1002", 20.00, 3,order1));
		order1.getOrderLines().add(new OrderLine("1003", 30.00, 4,order1));
		 
		
		Order order2 = new Order(LocalDate.of(2020, 9, 30), "2001", 5.50, 1);
		order2.getOrderLines().add(new OrderLine("2002", 10.50, 3,order2));
		order2.getOrderLines().add(new OrderLine("2003", 15.50, 4,order2));
		order2.getOrderLines().add(new OrderLine("2004", 20.50, 4,order2));

	
		orders.add(order1);
		orders.add(order2);
		
		System.out.println(orders);
		
		

	}


}
