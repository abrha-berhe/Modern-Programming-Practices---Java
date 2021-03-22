package Lab8_2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.equals(e2))
			return 0;
		else
			return e1.name.compareTo(e2.name);
	}
}
