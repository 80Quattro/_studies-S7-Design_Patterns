package pl.edu.wszib.lab02.adapter;

import pl.edu.wszib.lab02.adapter.toadapt.Order;
import pl.edu.wszib.lab02.adapter.toadapt.OrderId;
import pl.edu.wszib.lab02.adapter.toadapt.OrderItem;
import pl.edu.wszib.lab02.adapter.toadapt.ProductId;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public class Application {

    public static void main(String[] args) {
        // ex: adaptaion of uncompatible interface -DONE
        Order order = new Order(
                new OrderId(UUID.randomUUID().toString()),
                Set.of(
                        new OrderItem(new ProductId(UUID.randomUUID().toString()), BigDecimal.valueOf(1), BigDecimal.valueOf(1)),
                        new OrderItem(new ProductId(UUID.randomUUID().toString()), BigDecimal.valueOf(12), BigDecimal.valueOf(2)),
                        new OrderItem(new ProductId(UUID.randomUUID().toString()), BigDecimal.valueOf(2), BigDecimal.valueOf(4))
                )
        );

        OrderService orderService = new OrderService();
        //orderService.handle(order); // not allowed !!!
        OrderAdapter orderAdapter = new OrderAdapter(orderService);
        orderAdapter.handle(order);
    }

}
