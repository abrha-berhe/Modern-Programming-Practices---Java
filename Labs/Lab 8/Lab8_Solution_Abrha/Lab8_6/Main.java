package Lab8_6;

import java.util.*;
import java.util.function.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(Employee e) -> e.getName();
		Function<Employee, String> name = Employee::getName;
//		 BiFunction<Integer, Integer, Integer> power = Math::pow;
//		 
//		Predicate<Employee, String> isSet = Employee::set;
//		(Employee e,String s) -> e.setName(s);
//		 (String s1,String s2) -> s1.compareTo(s2);
//		
//		 (Apple a) -> a.getWeight();
//		 (String x) -> Integer::parseInt(x);
//		 EmployeeNameComparator comp = new EmployeeNameComparator();
//		 (Employee e1, Employee e2) -> comp.compare(e1,e2);

	}

}
