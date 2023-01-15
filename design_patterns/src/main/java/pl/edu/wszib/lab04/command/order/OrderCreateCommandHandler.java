package pl.edu.wszib.lab04.command.order;

import pl.edu.wszib.lab04.command.CommandHandler;

public class OrderCreateCommandHandler implements CommandHandler<OrderCreateCommand> {

    @Override
    public void handle(OrderCreateCommand command) {
        System.out.println("Real imp for command = " + command);
    }

}
