interface Order{
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order{
    public void placeOrder(String item, int qty){
        System.out.println("Order placed for " + qty + " " + item);
    }
}

class FinalOrder extends PartialOrder{
    public void cancelOrder(int orderId){
        System.out.println("Order with ID " + orderId + " has been cancelled.");
    }

    public void generateBill(){
        System.out.println("Generating bill for the order...");
    }
}

public class onlineOrder {
    public static void main(String[] args){
        FinalOrder order = new FinalOrder();
        order.placeOrder("Laptop", 1);
        order.generateBill();
        order.cancelOrder(12345);
    }
    
}
