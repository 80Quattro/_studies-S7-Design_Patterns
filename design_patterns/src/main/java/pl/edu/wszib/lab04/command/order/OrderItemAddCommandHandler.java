package pl.edu.wszib.lab04.command.order;

import pl.edu.wszib.lab04.command.CommandHandler;

public class OrderItemAddCommandHandler implements CommandHandler<OrderItemAddCommand> {

    @Override
    public void handle(OrderItemAddCommand command) {
        System.out.println("Real imp for command = " + command);
    }
}
