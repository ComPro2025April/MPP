package lesson2.lab.prob2B.ext;

import lesson2.lab.prob2B.Order;
import lesson2.lab.prob2B.OrderLine;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addOrderLine(new OrderLine("Samsung", order));
        order.addOrderLine(new OrderLine("Apple", order));
        order.addOrderLine(new OrderLine("Galaxy", order));

        System.out.println(order);
    }
}
