package lesson3.lab.prob1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		this.salary = s;
		this.person = new Person(n);
	}
	
	@Override
	public boolean equals(Object aPersonWithJob) {
		if(aPersonWithJob == null) return false; 
		if(!(aPersonWithJob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPersonWithJob;
		boolean isEqual = this.person.getName().equals(p.person.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
		PersonWithJob pwj = new PersonWithJob("Joe", 30000);
		Person p1 = pwj.person;
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		// p1 is PersonWithJob, p2 is Person
		// 1st case: we are comparing two object using PersonWithJob's equal method.
		// It compares two object's name. If it is not equal return false, otherwise it compares
		// two object's salary. In this case p1 has salary 30000, p2 doesn't have salary
		System.out.println("p1.equals(p2)? " + p1.equals(p2));

		// 2nd case: we are comparing two object using Person's equal method.
		// It compares two object's name. If it is not equal return false, otherwise it returns true
		// In this case both p1 and p2 have name "Joe"
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}
}
