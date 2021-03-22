package Lab9_11A;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MyLibrary {
	
	public static final TriFunction<List<Employee>,String,Integer,String> SPECIAL_EMPLOYEES = (emps,nameRange,salary) ->emps.stream()
	.filter(e->e.getSalary()>salary)
	.filter(e->Pattern.compile("\\A["+nameRange+"]").matcher(e.getLastName()).find())
	.sorted(Comparator.comparing(Employee::getFirstName))
	.map(E->E.getFirstName().concat(" "+E.getLastName()))				
	.collect(Collectors.joining(", "));	  

}
