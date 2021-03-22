package Lab8_1;

import java.util.function.Supplier;

public class Random {

	public static void main(String[] args) {

		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
	}

}
