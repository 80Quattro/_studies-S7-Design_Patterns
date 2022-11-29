package pl.edu.wszib.lab02.adapter;

import pl.edu.wszib.lab02.adapter.toadapt.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderAdapter {

    public OrderAdapter(OrderService orderService) {
        this.orderService = orderService;
    }

    private final OrderService orderService;

    public void handle(Order order) {

        String id = order.id.toString();
        List<OrderItem> items = new ArrayList<>();

        order.items.forEach((pl.edu.wszib.lab02.adapter.toadapt.OrderItem item) -> {
            items.add(new OrderItem(
                        item.productId.toString(),
                        item.quantity,
                        item.price
                    )
            );
        });
        pl.edu.wszib.lab02.adapter.Order adapterOrder = new pl.edu.wszib.lab02.adapter.Order(id, items);
        orderService.handle(adapterOrder);
    }
}
