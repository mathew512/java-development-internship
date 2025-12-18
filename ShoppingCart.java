import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    // 1. Add item with price
    public void addItem(String name, double price) {
        items.put(name, price);
        System.out.println("Added: " + name + " - $" + price);
    }

    // 2. Remove item
    public void removeItem(String name) {
        if (items.containsKey(name)) {
            items.remove(name);
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Item not found: " + name);
        }
    }

    // 3. Calculate total price
    public double getTotal() {
        double total = 0;
        for (double price : items.values()) {
            total += price;
        }
        // 4. Apply 10% discount if total > 100
        if (total > 100) {
            total *= 0.9;
            System.out.println("10% discount applied!");
        }
        return total;
    }

    // Display items
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in cart:");
            for (Map.Entry<String, Double> entry : items.entrySet()) {
                System.out.println(entry.getKey() + " - $" + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items
        cart.addItem("Apple", 2.5);
        cart.addItem("Banana", 1.0);
        cart.addItem("Orange", 3.0);

        cart.displayItems();

        // Calculate total
        double total = cart.getTotal();
        System.out.println("Total: $" + total);

        // Add more to trigger discount
        cart.addItem("Laptop", 120.0);
        cart.displayItems();
        total = cart.getTotal();
        System.out.println("Total after discount: $" + total);

        // Remove item
        cart.removeItem("Banana");
        cart.displayItems();
        total = cart.getTotal();
        System.out.println("Total after removal: $" + total);
    }
}