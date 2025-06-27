package lesson4.lab.probC;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(double commission, double baseSalary) {
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }

    public double calcGrossPay(int months, int years){
        double sum = 0;
        for(Order order : orders) {
            if((order.getOrderDate().getMonthValue() + order.getOrderDate().getYear()*12) == (months - 1 + years*12)) {
                sum += order.getOrderAmount();
            }
        }
        return baseSalary + sum * commission / 100;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double getCommission() {
        return commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
