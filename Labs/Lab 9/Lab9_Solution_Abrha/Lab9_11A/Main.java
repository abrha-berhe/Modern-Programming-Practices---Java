package Lab9_11A;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		
		// ============ Answer for Question 11A ============
		
		String specialEmployee = emps.stream().filter(e -> e.getSalary() > 100000)
				.filter(e -> Pattern.compile("\\A[N-Z]").matcher(e.getLastName()).find())
				.sorted(Comparator.comparing(Employee::getFirstName))
				.map(E -> E.getFirstName().concat(" " + E.getLastName())).collect(Collectors.joining(", "));

		System.out.println("========== Stream Pipeline from Main ");
		System.out.println(specialEmployee);

		// ============ Answer for Question 11B ============
		String nameRange = "N-Z";
		Integer salary = 100000;

		System.out.println("\n\n========== Stream Pipeline from Lambda Library ");
		String specialEmployee2 = MyLibrary.SPECIAL_EMPLOYEES.apply(emps, nameRange, salary);
		System.out.println(specialEmployee2);
		

	}

}
