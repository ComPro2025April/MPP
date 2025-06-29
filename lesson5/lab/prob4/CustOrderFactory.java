package lesson5.lab.prob4;

import java.time.LocalDate;

public class CustOrderFactory {

    public static Customer createCustomer(String name){
        Customer e = new Customer(name);
        return e;
    }

    public static Order createOrder(Customer customer, LocalDate orderDate){
        return Order.newOrder(customer,orderDate );
    }

    public static void addItem(Order order, String itemName) {
        if (order == null || itemName == null || itemName.isBlank())
            throw new IllegalArgumentException("Invalid order or item name");
        order.addItem(itemName);
    }
}