package java_class_peoject.services1;
import java_class_peoject.model1.product;
import java.util.*;

 public class Cart {
   HashMap<product, Integer> items = new HashMap<>();

public void addItem(product p, int qty) {
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

      void clearCart() {
        items.clear();
    }
}
