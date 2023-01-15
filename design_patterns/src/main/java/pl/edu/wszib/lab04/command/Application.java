package pl.edu.wszib.lab04.command;

import pl.edu.wszib.lab02.adapter.Order;
import pl.edu.wszib.lab04.command.order.OrderCreateCommand;
import pl.edu.wszib.lab04.command.order.OrderCreateCommandHandler;
import pl.edu.wszib.lab04.command.order.OrderItemAddCommand;
import pl.edu.wszib.lab04.command.order.OrderItemAddCommandHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Application {

    public static void main(String[] args) {
        final CommandBus commandBus = new CommandBus(Map.of(
                OrderCreateCommand.class, new OrderCreateCommandHandler(),
                OrderItemAddCommand.class, new OrderItemAddCommandHandler()
        ));

        final OrderCreateCommand orderCreateCommand = new OrderCreateCommand(UUID.randomUUID().toString());
        commandBus.execute(orderCreateCommand);

        // TODO task1: add new command - OrderItemAddCommand(orderId, productId, quantity)
        final OrderItemAddCommand orderItemAddCommand = new OrderItemAddCommand(
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                10
        );
        commandBus.execute(orderItemAddCommand);
    }

}
