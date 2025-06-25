package lesson2.lab.prob2B;

public class OrderLine {
    private String productName;
    private Order order;

    public OrderLine(String productName, Order order) {
        this.productName = productName;
        this.order = order;
    }

    @Override
    public String toString() {
        return productName;
    }
}
