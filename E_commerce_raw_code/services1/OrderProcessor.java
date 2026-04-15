package E_commerce_raw_code.services1;
import E_commerce_raw_code.model1.product;
import java.io.*;

public class OrderProcessor {
     static final double TAX_RATE = 0.18;
    static final double SHIPPING = 50;

   public void checkout(Cart cart, Discount discout){
           if (cart.items.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }

        double total = cart.getTotal();
        double discountAmount = 0;


        if (discout != null) {
            discountAmount = discout.apply(total);
        }

        double afterDiscount = total - discountAmount;
        double tax = afterDiscount * TAX_RATE;
        double finalAmount = afterDiscount + tax + SHIPPING;

           System.out.println("\n------ BILL SUMMARY ------");
        System.out.println("Cart Total: Rupees: " + total);
        System.out.println("Discount: -Rupees: " + discountAmount);
        System.out.println("After Discount: Rupees: " + afterDiscount);
        System.out.println("Tax (18%): Rupees: " + tax);
        System.out.println("Shipping: Rupees: " + SHIPPING);
        System.out.println("--------------------------");
        System.out.println("FINAL AMOUNT: Rupees: " + finalAmount);

          try {
            FileWriter fw = new FileWriter("orders.txt", true);
            fw.write("Order Total: ₹" + finalAmount + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving order!");
        }

        for (product p : cart.items.keySet()) {
            p.reduceStock(cart.items.get(p));
        }

        cart.clearCart();
        System.out.println("Order placed successfully!");
    }
}  