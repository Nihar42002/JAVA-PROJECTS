package E_commerce_raw_code.services1;

import E_commerce_raw_code.model1.product;
import java.util.*;

public class Cart {
    HashMap<product, Integer> items = new HashMap<>();

    public void addItem(product p, int qty) throws InvalidQuantityException {
        if (qty <= 0) {
            throw new InvalidQuantityException("Quantity must be greater than 0!");
        }
        items.put(p, items.getOrDefault(p, 0) + qty);
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }

        double total = 0;
        System.out.println("------ CART ------");
        for (product p : items.keySet()) {
            int qty = items.get(p);
            double itemTotal = p.price * qty;
            total += itemTotal;
            System.out.println(p.name + " x " + qty + " = rupees: " + itemTotal);
        }
        System.out.println("------------------");
        System.out.println("Subtotal = rupees: " + total);
    }

    public double getTotal() {
        double total = 0;
        for (product p : items.keySet()) {
            total += p.price * items.get(p);
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }
}