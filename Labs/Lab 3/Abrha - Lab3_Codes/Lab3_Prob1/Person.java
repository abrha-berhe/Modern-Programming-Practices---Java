package Lab3_Prob1;


public class Person {

	private String name;
	public Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		boolean isEqual = false;
		if(aPerson == null) 
			return isEqual; 
		if(!(aPerson instanceof Person) && !(aPerson instanceof PersonWithJob))
			return isEqual;
		if (this.getClass().equals(aPerson.getClass())) {
			Person p = (Person) aPerson;
			 isEqual = this.getName().equals(p.getName());
		}
		else {
			PersonWithJob p = (PersonWithJob) aPerson;
			 isEqual = this.getName().equals(p.getPerson().getName()) ;
		}
		return isEqual;
	}
	public static void main(String[] args) {
		
	}

}
