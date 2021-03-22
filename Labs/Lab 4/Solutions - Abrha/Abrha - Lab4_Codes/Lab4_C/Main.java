package Lab4_C;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Commissioned commissioned = new Commissioned(3,300,"1001");
		commissioned.addOrder(1, LocalDate.of(2020, 01, 20), 1000);
		commissioned.addOrder(1, LocalDate.of(2020, 02, 25), 2000);
		commissioned.print();
		
		Employee salaried = new Salaried(4500, "2001");
		salaried.print();
		
		Employee hourly = new Hourly(120, 30, "3001");
		hourly.print();
	}

}
