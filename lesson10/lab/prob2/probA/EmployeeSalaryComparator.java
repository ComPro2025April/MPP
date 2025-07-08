package lesson10.lab.prob2.probA;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.salary == e2.salary)
			return  e1.name.compareTo(e2.name);
		else if(e1.salary < e2.salary) return -1;
		else return 1;
	}
}
