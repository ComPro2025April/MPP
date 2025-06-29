package lesson5.lab.prob4.extpackage;

import lesson5.lab.prob4.CustOrderFactory;
import lesson5.lab.prob4.Customer;
import lesson5.lab.prob4.Order;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		/*Customer cust = new Customer("Bob");

		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());*/


		Customer cust = CustOrderFactory.createCustomer("Bob");

		Order order1 = CustOrderFactory.createOrder(cust, LocalDate.now());
		CustOrderFactory.addItem(order1, "Shirt");
		CustOrderFactory.addItem(order1, "Laptop");

		Order order2 = CustOrderFactory.createOrder(cust, LocalDate.now());
		CustOrderFactory.addItem(order2, "Pants");
		CustOrderFactory.addItem(order2, "Knife set");

		System.out.println(cust.getOrders());
	}
}