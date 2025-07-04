Employee class try to override equals method. 
But equals method signature is "public boolean equals(Object ob)". 
So "public boolean equals(Employee e)" this equals method not overriding equals method it is overloading equals method. 

	public boolean equals(Object ob) {
		Employee e = (Employee)ob;
		return e.name.equals(name) && e.salary == salary;
	}