package lesson4.lab.probE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;

	public Employee(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}

	public double computeUpdatedBalanceSum() {
		double sum = 0;
		for (Account account : accounts) {
			sum += account.getBalance();
		}
		return sum;
	}

	public String getName() {
		return name;
	}
	public void addAccount(Account account) {
		accounts.add(account);
	}
}
