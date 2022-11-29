package pl.edu.wszib.lab02.decorator;

public class Application {

    public static void main(String[] args) {
        SimpleOrderService simpleOrderService = new SimpleOrderService();
        Integer testName = simpleOrderService.handle("Test name");

        //LogAroundOrderServiceDecorator decoratedOrderService = new LogAroundOrderServiceDecorator(simpleOrderService);
        //decoratedOrderService.handle("Test name");

        OrderService decoratedOrderService = new TestOrderServiceDecorator(new LogAroundOrderServiceDecorator(simpleOrderService));
        decoratedOrderService.handle("Test name");
    }

}
