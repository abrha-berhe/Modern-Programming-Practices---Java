package Lab9_04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {

	public static void main(String[] args) {

		// Stream<Integer> primeNums = Stream.iterate(2,
		// n->n+1).filter(n->isPrime(n)).limit(10);
		// primeNums.forEach(System.out::print);

		PrimeStream ps = new PrimeStream(); // PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);

	}

	// Predicate<Integer> isPrime = n->

	void printFirstNPrimes(long num) {
		Function<Integer, Integer> nextPrime = n -> {
			for (int i = n + 1;; i++) {
				if (isPrime(i))
					return i;
			}
		};
		// Stream<Integer> primeNums = Stream.iterate(2,
		// n->n+1).filter(n->isPrime(n)).limit(num); // Omitted because we are told not to use filter
		Stream<Integer> primeNums = Stream.iterate(2, n -> nextPrime.apply(n)).limit(num);
		System.out.println(primeNums.collect(Collectors.toList()));
		// primeNums.forEach(System.out::println);
		// return primeNums.collect(Collectors.toList());
	}

	// static boolean isPrime(Integer number) {
	// boolean checkingPrime = (number>0 && number!=1) &&
	// (Stream.iterate(2,n->n+1).filter(n->!(number!=n &&
	// number%n==0)).limit(number)).count()>0;
	// return checkingPrime;
	//
	// }

	static boolean isPrime(Integer number) {
		if (number > 0 && number != 1) {
			for (int i = 2; i <= number; i++) {
				if (number != i && number % i == 0)
					return false;
			}
			return true;
		} else
			return false;

	}

	// Imperative way
	static List<Integer> primeNumbers(Integer n) {
		List<Integer> primes = new ArrayList<>();
		for (int i = 0; i <= Integer.MAX_VALUE; i++) {
			if (isPrime(i)) {
				primes.add(i);
				if (primes.size() == n)
					return primes;
			}

		}
		return primes;
	}

}
