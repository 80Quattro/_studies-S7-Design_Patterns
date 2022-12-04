package pl.edu.wszib.lab02.facade;

public class Application {

    public static void main(String[] args) {
        // without facade
        OrderCreateService orderCreateService = new OrderCreateService();
        orderCreateService.create();

        OrderReadService orderReadService = new OrderReadService();
        orderReadService.read();

        // with facade
        OrderFacade orderFacade = new OrderFacade(
                new OrderCreateService(),
                new OrderReadService(),
                new OrderUpdateService(),
                new OrderDeleteService());
        orderFacade.create();
        orderFacade.read();

        // TODO: add methods update and delete to facade
        orderFacade.update();
        orderFacade.delete();
    }

}
