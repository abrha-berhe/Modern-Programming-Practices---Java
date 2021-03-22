package Lab3_Prob1;

public class PersonWithJob {

	private double salary;
	private Person person;

	PersonWithJob(String n, double s) {
		this.salary = s;
		this.person = new Person(n);
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object aPerson) {
		boolean isEqual = false;
		if (aPerson == null)
			return isEqual;
		if (!(aPerson instanceof PersonWithJob) && !(aPerson instanceof Person))
			return isEqual;
		if (this.getClass().equals(aPerson.getClass())) {
			PersonWithJob p = (PersonWithJob) aPerson;
			 isEqual = this.person.getName().equals(p.person.getName()) && this.getSalary() == p.getSalary();
		}
		else  {
			Person p = (Person) aPerson;
			 isEqual = this.person.getName().equals(p.getName()) ;
		}
		return isEqual;
	}

	public Person getPerson() {
		return person;
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		
		PersonWithJob p3 = new PersonWithJob("Joe", 3000);
		Person p4 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p3));
		System.out.println("p2.equals(p1)? " + p4.equals(p1));
	}

}
