package pl.edu.wszib.lab04.command.order;

import pl.edu.wszib.lab04.command.Command;

public record OrderItemAddCommand(
        String orderId,
        String productId,
        Integer quantity
) implements Command {
}
