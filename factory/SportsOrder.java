package factory;

public class SportsOrder implements Order{
    @Override
    public void processOrder() {
        System.out.println("Processing sports order.");
    }
}
