package factory;

public class OnlineOrderProcessingFactory {
    public static void main(String[] args) {
        Order foodOrder = OrderFactory.createOrder("food");
        foodOrder.processOrder();

        Order clothingOrder = OrderFactory.createOrder("clothing");
        clothingOrder.processOrder();

        // new order
        Order sportsOrder = OrderFactory.createOrder("sports");
        sportsOrder.processOrder();
    }
}
