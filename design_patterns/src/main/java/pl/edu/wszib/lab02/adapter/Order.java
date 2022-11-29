package pl.edu.wszib.lab02.adapter;

import java.util.List;

public class Order {

    private final String orderId;
    private final List<OrderItem> items;

    public Order(String orderId, List<OrderItem> items) {
        this.orderId = orderId;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", items=" + items +
                '}';
    }
}
