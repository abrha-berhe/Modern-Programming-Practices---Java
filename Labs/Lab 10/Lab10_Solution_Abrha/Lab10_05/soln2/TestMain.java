package Lab10_05.soln2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {
	@Test
	public void testSalaryGreaterThan100000() {
		Employee e1 = new Employee("Joe", "Andrews", 90000); 
		Employee e2 = new Employee("Bill", "Richards", 120000); 
		Main m = new Main();
		assertTrue(m.salaryGreaterThan100000(e2));
		assertFalse(m.salaryGreaterThan100000(e1));
	}
	
	public void testLastNameAfterM() {
		Employee e1 = new Employee("Joe", "Andrews", 90000);  
		Employee e2 = new Employee("Bill", "Richards", 120000);  
		Main m = new Main();
		assertTrue(m.lastNameAfterM(e2));
		assertFalse(m.salaryGreaterThan100000(e1));
	}
	
	public void testFullName() {
		Employee e1 = new Employee("Joe", "Andrews", 90000);  
		Main m = new Main();
		assertEquals("Joe Andrews", m.fullName(e1));
	}
}
