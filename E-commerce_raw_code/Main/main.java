package java_class_peoject.Main;
import java.util.*;
import java_class_peoject.model1.product;
import java_class_peoject.services1.Cart;
import java_class_peoject.services1.Discount;
import java_class_peoject.services1.OrderProcessor;

public class main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       ArrayList<product> products = new ArrayList<>();
         products.add(new product(1, "Laptop", 50000, 5));
        products.add(new product(2, "Phone", 20000, 2));
        products.add(new product(3, "Headphones", 2000, 10));

         Cart cart = new Cart();
        Discount discount = null;

          boolean running = true;


        while (running) {
            System.out.println("\n------ MAIN MENU ------");
            System.out.println("1. View Products");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Apply Coupon");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

             int choice = sc.nextInt();

                switch (choice) {
                    case 1: 
                      System.out.println("\n------ PRODUCTS ------");
                    for (product p : products) {
                        System.out.println(p.id + " " + p.name + " rupees: " + p.price + " Stock:" + p.stock);
                    }
                    break;

                    case 2:
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        product selected = null;
                          for (product p : products) {
                        if (p.id == id) {
                            selected = p;
                            break;
                        }
                    }
                     if (selected == null) {
                        System.out.println("Product not found!");
                    } else if (!selected.isAvailable(qty)) {
                        System.out.println("Not enough stock!");
                    } else {
                        cart.addItem(selected, qty);
                        System.out.println("Item added to cart.");
                    }
                    break;

                    case 3:
                        cart.displayCart();
                        break;

                    case 4: 
                    System.out.print("Enter coupon code: ");
                    String code = sc.next();

                    Discount temp = new Discount("SAVE10", 10, 10000);

                       if (temp.isApplicable(code, cart.getTotal())) {
                        discount = temp;
                        System.out.println("Coupon applied!");
                    } else {
                        System.out.println("Invalid or not eligible!");
                    }
                    break;

                    case 5:
                        OrderProcessor op = new OrderProcessor();
                    op.checkout(cart, discount);
                    discount = null;
                    break;

                      case 6:
                    running = false;
                    System.out.println("Thank you!");
                    break;


                default:
                    System.out.println("Invalid choice!");
            }
        }
sc.close();

    }
}
