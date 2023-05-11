package factory;

public class FoodOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Processing food order");
    }
}
