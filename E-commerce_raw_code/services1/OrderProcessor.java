package java_class_peoject.services1;
import java_class_peoject.model1.product;

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

        for (product p : cart.items.keySet()) {
            p.reduceStock(cart.items.get(p));
        }


        cart.clearCart();
        System.out.println("Order placed successfully!");
    }
}
    