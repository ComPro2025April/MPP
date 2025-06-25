package lesson2.lab.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<OrderLine> orderLines;

    public Order() {
        this.orderDate = LocalDate.now();
        this.orderLines = new ArrayList<>();
        orderLines.add(new OrderLine("Default product", this));
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(orderDate.toString());
        sb.append("\n");
        for (OrderLine orderLine : orderLines) {
            sb.append(orderLine.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
