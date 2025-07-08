package lesson10.lab.prob2.probA;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.name.compareTo(e2.name) == 0)
			return e1.salary - e2.salary;
		return e1.name.compareTo(e2.name);
	}
}
