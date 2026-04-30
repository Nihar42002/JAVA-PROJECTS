package E_commerce_raw_code.model1;

public class Mobile extends Electronics {
public String brand;
public Mobile(int id, String name, double price, int stock, int warranty,
String brand) {
super(id, name, price, stock, warranty);
this.brand = brand;
}
}