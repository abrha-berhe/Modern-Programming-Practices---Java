package Lab9_09;

import java.util.function.Function;
import java.util.stream.IntStream;

public class SquaresGenerator {

	public static void main(String[] args) {
		printSquares(10);

	}
	
	public static void printSquares(int num) {
		Function<Integer, Integer> fun = n->(int)Math.pow((Math.sqrt(n)+1),2);
		IntStream powers = IntStream.iterate(1, (n)->fun.apply(n)).limit(num);
		powers.forEach(System.out::println);
	}

}
