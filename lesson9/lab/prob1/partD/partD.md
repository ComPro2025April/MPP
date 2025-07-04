In this code equals and hashCode both using visited variable. 
But inside removeDuplicates() function keep changing visited variable.
That's why our equals and hashCode logic is broken.
Fixed code:

    @Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee emp = (Employee)ob;
		return emp.name.equals(name) && emp.salary == salary; 
    }
	
	@Override
	public int hashCode() {
		int result = 17;
		long longval = Double.doubleToLongBits(salary);
		int salaryHash = (int) (longval ^ (longval >>> 32));
		result += 31 * result + name.hashCode();
		result += 31 * result + salaryHash;
		return result;
	}