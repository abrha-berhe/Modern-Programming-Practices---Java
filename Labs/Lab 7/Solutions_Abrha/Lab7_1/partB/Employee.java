package Lab7_1.partB;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	

	public boolean equals(Employee e) {
		return e.name.equals(name) && e.salary == salary;
	}
	
//	public boolean equals(Object e) {	// The parameter Employee should be replaced by Object
//		if(e == null) return false;
//		if(this.getClass() != e.getClass()) return false;
//		Employee emp = (Employee) e;
//		return emp.name.equals(name) && emp.salary == salary;
//	}
	
	
//	public boolean equals(Object ob) {
//		Employee e = (Employee)ob;
//		return e.name.equals(name) && e.salary == salary;
//	}
}
