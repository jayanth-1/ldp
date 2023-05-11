package factory;

public class OrderFactory {
    public static Order createOrder(String type) {
        return switch (type) {
            case "food" -> new FoodOrder();
            case "clothing" -> new ClothingOrder();
            // added new order type
            case "sports" -> new SportsOrder();
            default -> throw new IllegalArgumentException("Invalid order type: " + type);
        };
    }
}
