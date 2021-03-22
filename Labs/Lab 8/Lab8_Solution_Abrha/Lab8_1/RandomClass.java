package Lab8_1;

import java.util.function.Supplier;

public class RandomClass {
	private class SupplierClass implements Supplier {
		@Override
		public Object get() {
			return Math.random();
		}

	}

	public SupplierClass getInnerClass() {
		return new SupplierClass();
	}

	public static void main(String[] args) {
		RandomClass myClass = new RandomClass();
		SupplierClass Random = myClass.getInnerClass();
		System.out.println(Random.get());

		// RandomClass random = new RandomClass();
		// System.out.println(random.randomNumber());

	}

}

// OR

/*
 * public class RandomClass {
 * 
 * public double randomNumber () { class SupplierClass implements
 * Supplier<Double> {
 * 
 * @Override public Double get() { return Math.random(); } } SupplierClass
 * supplier = new SupplierClass(); return supplier.get(); }
 * 
 * }
 * 
 */
