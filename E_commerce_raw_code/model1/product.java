package E_commerce_raw_code.model1;

public class product {
    public int id;
    public String name;
    public double price;
    public int stock;

    public product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvailable(int qty) {
        return stock >= qty;
    }

    public void reduceStock(int qty) {
        stock -= qty;
    }
}