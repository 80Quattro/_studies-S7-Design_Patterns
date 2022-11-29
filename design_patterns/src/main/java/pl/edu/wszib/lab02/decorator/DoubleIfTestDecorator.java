package pl.edu.wszib.lab02.decorator;

public class DoubleIfTestDecorator implements OrderService {

    private final OrderService orderService;

    public DoubleIfTestDecorator(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public Integer handle(String name) {
        Integer result = orderService.handle(name);
        if(name.contains("test")) {
            return result * 2;
        }
        return result;
    }
}
