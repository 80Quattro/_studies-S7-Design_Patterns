package pl.edu.wszib.lab04.command.order;

public class OrderFacade {

    public void create(OrderCreateCommand command) {
        System.out.println("Real imp for command = " + command);
    }

    public void add(OrderItemAddCommand command) {
        System.out.println("Real imp for command = " + command);
    }
}
