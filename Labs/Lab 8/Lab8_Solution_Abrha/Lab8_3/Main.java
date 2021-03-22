package Lab8_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		
		BiFunction<Double, Double, List<Double>> f = (x, y) -> Arrays.asList(Math.pow(x,  y),x*y);
	 
		
		List<Double> numbers = f.apply(2.0, 3.0);
		System.out.println(numbers);

	}

}
